package Implementation;

import org.antlr.v4.runtime.ParserRuleContext;
import parser.PascalBaseListener;
import parser.PascalParser;
import utils.DataType;

import java.util.LinkedList;
import java.util.List;

public class PascalListenerImplementation extends PascalBaseListener {
    private FileHandler fileHandler;
    private int blockCount;
    private List<String> variableNamesToDeclare;

    private boolean ifFisrtFunctionParameter;
    private boolean isInsidefuntion;

    public PascalListenerImplementation() {
        fileHandler = new FileHandler("out.c");
        blockCount = 0;
        variableNamesToDeclare = new LinkedList<String>();
        ifFisrtFunctionParameter = true;
        isInsidefuntion = false;
    }

    @Override
    public void enterProgram(PascalParser.ProgramContext ctx) {
        fileHandler.writeString("#include <stdio.h>\n \n");
    }

    @Override
    public void enterProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        fileHandler.writeString("\nvoid " + identifier);
        if (ctx.formalParameterList() == null) fileHandler.writeString("()");
        isInsidefuntion = true;
    }


    @Override
    public void enterFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        DataType returnType = new DataType(ctx.resultType().getText());
        fileHandler.writeString("\n" + returnType.toString() + " " + identifier);
        if (ctx.formalParameterList() == null) fileHandler.writeString("()");
        isInsidefuntion = true;
    }

    @Override
    public void exitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx) {
        ifFisrtFunctionParameter = true;
        isInsidefuntion = false;
    }

    @Override
    public void exitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx) {
        ifFisrtFunctionParameter = true;
        isInsidefuntion = false;
    }

    @Override
    public void enterFormalParameterList(PascalParser.FormalParameterListContext ctx) {
        fileHandler.writeString("(");
    }

    @Override
    public void exitFormalParameterList(PascalParser.FormalParameterListContext ctx) {
        fileHandler.writeString(")");
    }

    @Override
    public void exitParameterGroup(PascalParser.ParameterGroupContext ctx) {
        DataType type = new DataType(ctx.typeIdentifier().getText());
        String identifier;
        for (PascalParser.IdentifierContext c: ctx.identifierList().identifier()){
            identifier = c.getText();
            fileHandler.writeParameterDeclaration(identifier,type,ifFisrtFunctionParameter);
            ifFisrtFunctionParameter = false;
        }
    }

    @Override
    public void enterBlock(PascalParser.BlockContext ctx) {
        if (ctx.getParent() instanceof PascalParser.FunctionDeclarationContext
                || ctx.getParent() instanceof PascalParser.ProcedureDeclarationContext
                )fileHandler.writeString("{\n");
        blockCount++;
    }

    @Override
    public void exitConstantDefinition(PascalParser.ConstantDefinitionContext ctx) {
        String identifier = ctx.identifier().getText();
        String value = ctx.constant().getText();
        DataType dataType;
        if (blockCount == 1){
            fileHandler.writeConstantDefinition(identifier,value,true);
        } else {
            fileHandler.writeConstantDefinition(identifier,value,false);
        }

    }

    @Override
    public void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx) {
        DataType dataType = new DataType(ctx.type().getText());
        String variableList = ctx.identifierList().getText();
        fileHandler.writeVariableDeclaration(variableList,dataType);
    }


    @Override
    public void enterCompoundStatement(PascalParser.CompoundStatementContext ctx) {
        if (blockCount == 1 && ctx.getParent() instanceof PascalParser.BlockContext){
            fileHandler.writeString("\nint main(void)");
        }
    }

    @Override
    public void enterStatements(PascalParser.StatementsContext ctx) {
        ParserRuleContext gggParrent = ctx.getParent().getParent().getParent();
        if (gggParrent instanceof PascalParser.FunctionDeclarationContext){
            PascalParser.FunctionDeclarationContext functionContext =
                    (PascalParser.FunctionDeclarationContext) gggParrent;
            String identifier = functionContext.identifier().getText();
            DataType returnType = new DataType(functionContext.resultType().getText());
            fileHandler.writeVariableDeclaration(identifier, returnType);
        }
        if (isInsidefuntion) fileHandler.writeString("\n");
        else fileHandler.writeString("{\n");
    }

    @Override
    public void exitStatements(PascalParser.StatementsContext ctx) {
        ParserRuleContext gggParrent = ctx.getParent().getParent().getParent();
        if (gggParrent instanceof PascalParser.FunctionDeclarationContext){
            PascalParser.FunctionDeclarationContext functionContext =
                    (PascalParser.FunctionDeclarationContext) gggParrent;
            String identifier = functionContext.identifier().getText();
            fileHandler.writeString("\nreturn " + identifier + "; \n}\n");
        } else if (ctx.getParent() instanceof PascalParser.RepeatStatementContext){
            fileHandler.writeString("\n} while(");
        } else fileHandler.writeString("\n}");
    }

    @Override
    public void enterWhileStatement(PascalParser.WhileStatementContext ctx) {
        fileHandler.writeString("while ");
    }

    @Override
    public void enterRepeatStatement(PascalParser.RepeatStatementContext ctx) {
        fileHandler.writeString("do ");
    }

    @Override
    public void exitRepeatStatement(PascalParser.RepeatStatementContext ctx) {
        fileHandler.writeString(")\n");
    }

    @Override
    public void enterForStatement(PascalParser.ForStatementContext ctx) {
        String counter = ctx.identifier().getText();
        String initialValue = ctx.forList().initialValue().getText();
        String finalValue = ctx.forList().finalValue().getText();
        String[] sign = new String[2];
        sign[0] = ctx.forList().DOWNTO() == null ? "<=" : ">=";
        sign[1] = ctx.forList().DOWNTO() == null ? "++" : "--";
        fileHandler.writeForStatement(counter,initialValue,finalValue,sign);
    }



    @Override
    public void enterExpression(PascalParser.ExpressionContext ctx) {
        String text = ctx.getText();
        if(ctx.getParent().getParent() instanceof PascalParser.RepetetiveStatementContext ||
                ctx.getParent().getParent() instanceof PascalParser.ConditionalStatementContext){
            fileHandler.writeString("(");
        }
        if (!(ctx.getParent() instanceof PascalParser.ParameterListContext)) {
            String finaText = text.replace("=","==")
                    .replace("<>","!=")
                    .replaceAll(" [aA][nN][dD] "," && ")
                    .replaceAll(" [oO][rR] "," || ")
                    .replaceAll(" [dD][iI][vV] ", " / ")
                    .replaceAll(" [mM][Oo][dD] ", " % ")
                    .replace("'","\"");
            fileHandler.writeString(finaText);

        }
    }

    @Override
    public void exitExpression(PascalParser.ExpressionContext ctx) {
        if(ctx.getParent().getParent() instanceof PascalParser.RepetetiveStatementContext ||
                ctx.getParent().getParent() instanceof PascalParser.ConditionalStatementContext){
            fileHandler.writeString(")");
        }
    }

    @Override
    public void exitBlock(PascalParser.BlockContext ctx) {
        blockCount--;
    }

    @Override
    public void exitProgram(PascalParser.ProgramContext ctx) {
        fileHandler.closeFile();
    }



    @Override
    public void enterAssignmentStatement(PascalParser.AssignmentStatementContext ctx){
        String variable = ctx.variable().getText();
        fileHandler.writeString(variable + " = ");
    }

    @Override
    public void exitSimpleStatement(PascalParser.SimpleStatementContext ctx) {
        if (ctx.getText() != null &&  !ctx.getText().equals("")) fileHandler.writeString(";\n");
    }

    @Override
    public void enterProcedureStatement(PascalParser.ProcedureStatementContext ctx) {
        String identifier = ctx.identifier().getText();
        fileHandler.writeString(identifier);
        if (ctx.parameterList() == null) fileHandler.writeString("()");
    }

    @Override
    public void enterParameterList(PascalParser.ParameterListContext ctx) {
        fileHandler.writeString("(");
    }

    @Override
    public void exitParameterList(PascalParser.ParameterListContext ctx) {
        fileHandler.writeString(")");
    }
}




