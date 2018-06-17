package Implementation;

import org.antlr.v4.runtime.tree.ParseTree;
import parser.PascalBaseListener;
import parser.PascalParser;

import java.util.HashMap;

public class PascalListenerImplementation extends PascalBaseListener {

    private HashMap<String,Integer> variables ;

    public PascalListenerImplementation(){
        variables = new HashMap<String, Integer>();
    }

    @Override
    public void enterProgram(PascalParser.ProgramContext ctx) {
        System.out.println("Entering Program \n");

    }

    @Override
    public void exitProgram(PascalParser.ProgramContext ctx) {
        System.out.println("Exiting Program");
    }

    @Override
    public void exitAssignmentStatement(PascalParser.AssignmentStatementContext ctx) {
       // String varName = ctx.getChild(0).getText();
       // int varValue = Integer.parseInt(ctx.getChild(2).getText());
        //variables.put(varName,varValue);

        for (ParseTree tree: ctx.children){
            getToBottom(tree);
            System.out.println(tree.toStringTree());
            System.out.println(tree.getText());
            System.out.println(tree.getPayload().getClass());
        }


    }

    private void getToBottom(ParseTree tree){
        if (tree.getChildCount() != 0){
            System.out.println(tree.getChildCount());
            for (int i = 0; i < tree.getChildCount(); i++){
                getToBottom(tree.getChild(i));
            }
        } else System.out.println("----");
    }

    public void evaluateExpression(String expression){
        String [] simpleExpresions = expression.trim().split(" = | <> | < | <= | >= | > | in ");
        }

    public void evaluateSimpleEXpression(String simpleExpression){
        String[] terms = simpleExpression.trim().split(" + | - | [oO][rR]");
        }

    public void evaluateTerm(String term){
        String[] signedFactors = term.trim().split("\\* | / | [dD][iI][vV] | [mM][oO][dD] | [aA][nN][dD]]");
    }

    public void evaluateSignedFactor(String signedFactor){
        String[] factor = signedFactor.trim().split("-| \\+");
    }

    public void evaluateFactor(String factor){
        factor = factor.trim();
        if (factor.matches("\\d\\*")); // liczba
        else if (factor.matches("[a-z|A-Z][a-z|A-Z|0-9|_]")); // identyfikator
        else if (factor.matches("^\\([\\S| ]*\\)$")); // expression ?


    }

}
