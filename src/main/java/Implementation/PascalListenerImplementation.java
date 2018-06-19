package Implementation;

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

    public PascalListenerImplementation() {
        fileHandler = new FileHandler("out.c");
        blockCount = 0;
        variableNamesToDeclare = new LinkedList<String>();
        ifFisrtFunctionParameter = true;
    }

    @Override
    public void enterProgram(PascalParser.ProgramContext ctx) {
        fileHandler.writeString("#include <stdio.h>\n \n");
    }

    @Override
    public void enterProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        fileHandler.writeString("\nvoid " + identifier);
        if (ctx.formalParameterList() == null) fileHandler.writeString("()\n");

    }


    @Override
    public void enterFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        DataType returnType = new DataType(ctx.resultType().getText());
        fileHandler.writeString("\n" + returnType.toString() + " " + identifier);
        if (ctx.formalParameterList() == null) fileHandler.writeString("()");
    }

    @Override
    public void exitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx) {
        ifFisrtFunctionParameter = true;
    }

    @Override
    public void exitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx) {
        ifFisrtFunctionParameter = true;
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
        if (blockCount != 0)fileHandler.writeString("{\n");
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
        if (blockCount == 1) fileHandler.writeString("int main(void){");

    }

    @Override
    public void exitCompoundStatement(PascalParser.CompoundStatementContext ctx) {
        fileHandler.writeString("}\n\n");

    }

    @Override
    public void exitBlock(PascalParser.BlockContext ctx) {
        blockCount--;
    }

    @Override
    public void exitProgram(PascalParser.ProgramContext ctx) {
        fileHandler.closeFile();
    }

}
