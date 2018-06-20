package Implementation;

import parser.PascalParser;

public class RepeatListener extends ExpressionListener {

    public RepeatListener() {
        super();
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
        String[] sign = new String[2];
        sign[0] = ctx.forList().DOWNTO() == null ? "<=" : ">=";
        sign[1] = ctx.forList().DOWNTO() == null ? "++" : "--";
        fileHandler.writeString("\nfor(int " + counter + " = ");
    }

    @Override
    public void exitForList(PascalParser.ForListContext ctx) {
        String counter = ((PascalParser.ForStatementContext) ctx.getParent()).identifier().getText();
        String sign = ctx.DOWNTO() == null ? "++" : "--";
        fileHandler.writeString("; " + counter + sign + ")");
    }

    @Override
    public void exitInitialValue(PascalParser.InitialValueContext ctx) {
        String sign = ((PascalParser.ForListContext) ctx.getParent()).DOWNTO() == null ? "<=" : ">=";
        String counter = ((PascalParser.ForStatementContext) ctx.getParent().getParent()).identifier().getText();
        fileHandler.writeString("; " + counter + " " + sign);
    }
}
