package Implementation;

import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.ErrorNode;

import parser.PascalBaseListener;
import parser.PascalParser;
import utils.DataType;




public class BaseListener extends PascalBaseListener{
    protected FileHandler fileHandler;
    private int blockCount;
    private boolean ifFisrtFunctionParameter;
    private boolean isInsidefuntion;



    public BaseListener() {
        fileHandler = new FileHandler("out.c");
        blockCount = 0;
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
            fileHandler.writeString("\n");
        } else fileHandler.writeString("{\n");
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
            fileHandler.writeString("\n} while(! ");
        } else fileHandler.writeString("\n}\n");
    }

    @Override
    public void enterIfStatement(PascalParser.IfStatementContext ctx) {
        fileHandler.writeString("if");
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

    @Override public void visitErrorNode(ErrorNode node) {
        System.out.println(node.getText() + " line: " + node.getSymbol().getLine() + ":" + node.getSymbol().getCharPositionInLine());
    }

}










