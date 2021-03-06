package Implementation;

import parser.PascalParser;
import utils.ExpressionTypesExtractor;
import utils.FunctionFactory;
import utils.functions.StdioFunction;

public class ExpressionListener extends BaseListener {

    public ExpressionListener() {
        super();
    }

    @Override
    public void enterExpression(PascalParser.ExpressionContext ctx) {
        if(ctx.getParent().getParent() instanceof PascalParser.RepetetiveStatementContext ||
                ctx.getParent().getParent() instanceof PascalParser.ConditionalStatementContext){
            fileHandler.writeString("(");
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
    public void exitSimpleExpression(PascalParser.SimpleExpressionContext ctx) {
        PascalParser.ExpressionContext parent = (PascalParser.ExpressionContext) ctx.getParent();
        int index = parent.simpleExpression().indexOf(ctx);
        //System.out.println("index:  " + index + "   size:   " + parent.simpleExpression().size());
        if (index < parent.simpleExpression().size()-1){
            String operator = parent.getChild(2*index + 1).getText()
                    .replaceAll("^=$","==").replace("<>","!=");
            fileHandler.writeString(" " + operator + " ");
        }
    }

    @Override
    public void exitTerm(PascalParser.TermContext ctx) {
        PascalParser.SimpleExpressionContext parent = (PascalParser.SimpleExpressionContext) ctx.getParent();
        int index = parent.term().indexOf(ctx);
        if (index < parent.term().size() - 1){
            String operator = parent.getChild(2*index + 1).getText().replaceAll("^[oO][rR]$"," || ");
            fileHandler.writeString(operator);
        }
    }

    @Override
    public void enterSignedFactor(PascalParser.SignedFactorContext ctx) {
        if (ctx.MINUS() != null) fileHandler.writeString(" - ");
        else if (ctx.PLUS() != null) fileHandler.writeString(" + ");
    }

    @Override
    public void exitSignedFactor(PascalParser.SignedFactorContext ctx) {
        PascalParser.TermContext parent = (PascalParser.TermContext) ctx.getParent();
        int index = parent.signedFactor().indexOf(ctx);
        if (index < parent.signedFactor().size() - 1){
            String operator = parent.getChild(2*index + 1).getText().replaceAll("^[aA][nN][dD]$"," && ")
                    .replaceAll("^[dD][iI][vV]$", " / ")
                    .replaceAll("^[mM][Oo][dD]$", " % ");
            fileHandler.writeString(operator);

        }
    }

    @Override
    public void enterFactor(PascalParser.FactorContext ctx) {
        if (ctx.expression() != null) fileHandler.writeString("(");
        else if (ctx.NOT() != null) fileHandler.writeString("!");
    }

    @Override
    public void exitFactor(PascalParser.FactorContext ctx) {
        if (ctx.expression() != null) fileHandler.writeString(")");
    }

    @Override
    public void enterVariable(PascalParser.VariableContext ctx) {
        if(! (ctx.getParent() instanceof PascalParser.AssignmentStatementContext))
        fileHandler.writeString(ctx.getText());
    }

    @Override
    public void enterUnsignedConstant(PascalParser.UnsignedConstantContext ctx) {
        fileHandler.writeString(ctx.getText().replace("'","\""));
    }

    @Override
    public void enterFunctionDesignator(PascalParser.FunctionDesignatorContext ctx) {
        fileHandler.writeString(ctx.identifier().getText() + "(");
    }

    @Override
    public void enterProcedureStatement(PascalParser.ProcedureStatementContext ctx) {
        ExpressionTypesExtractor extractor;
        String identifier = ctx.identifier().getText();
        if (FunctionFactory.isStdioFunction(identifier)){
            StdioFunction function = FunctionFactory.createFunction(identifier);
            extractor = new ExpressionTypesExtractor(ctx.parameterList(),this);
            function.setParameterList(extractor.getDataTypesList());
            function.processParameters();
            fileHandler.writeString(function.getFunctionDesignator());
        } else {
            fileHandler.writeString(identifier + "(");
            if (ctx.parameterList() == null) fileHandler.writeString("()");
        }

    }
    /*
    @Override
    public void enterParameterList(PascalParser.ParameterListContext ctx) {

        fileHandler.writeString("(");
    }
    */

    @Override
    public void exitActualParameter(PascalParser.ActualParameterContext ctx) {
        PascalParser.ParameterListContext parent = (PascalParser.ParameterListContext) ctx.getParent();
        int index = parent.actualParameter().indexOf(ctx);
        if (index < parent.actualParameter().size() - 1){
            fileHandler.writeString(", ");
        }
    }

    @Override
    public void exitParameterList(PascalParser.ParameterListContext ctx) {
        fileHandler.writeString(")");
    }
}
