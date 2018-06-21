package Implementation;

import parser.PascalParser;
import sun.security.krb5.internal.PAData;

public class ConditionalListener extends RepeatListener {
    public ConditionalListener() {
        super();
    }

    @Override
    public void enterIfStatement(PascalParser.IfStatementContext ctx) {
        fileHandler.writeString("if");
    }

    @Override
    public void enterStatement(PascalParser.StatementContext ctx) {
        if (ctx.getParent() instanceof PascalParser.IfStatementContext){
            PascalParser.IfStatementContext parent = (PascalParser.IfStatementContext) ctx.getParent();
            int index = parent.statement().indexOf(ctx);
            if (index == parent.statement().size() - 1) fileHandler.writeString("else ");
        }

    }

    @Override
    public void exitStatement(PascalParser.StatementContext ctx) {
        if (ctx.getParent() instanceof PascalParser.CaseListElementContext){
            PascalParser.CaseListElementContext parent = (PascalParser.CaseListElementContext) ctx.getParent();

        }
    }

    @Override
    public void enterCaseStatement(PascalParser.CaseStatementContext ctx) {
        fileHandler.writeString("switch");
    }

    @Override
    public void exitCaseStatement(PascalParser.CaseStatementContext ctx) {
        fileHandler.writeString("}");
    }

    @Override
    public void enterCaseListElement(PascalParser.CaseListElementContext ctx) {
        PascalParser.CaseStatementContext parent = (PascalParser.CaseStatementContext) ctx.getParent();
        int index = parent.caseListElement().indexOf(ctx);
        if (index == 0){
            fileHandler.writeString("{\n");
        }
        fileHandler.writeString("case ");
    }

    @Override
    public void enterConstList(PascalParser.ConstListContext ctx) {
        fileHandler.writeString(ctx.getText() + ":");
    }

    @Override
    public void exitCaseListElement(PascalParser.CaseListElementContext ctx) {
        PascalParser.CaseStatementContext parent = (PascalParser.CaseStatementContext) ctx.getParent();
        int index = parent.caseListElement().indexOf(ctx);

    }
}
