package Implementation;

import org.antlr.v4.runtime.tree.ParseTree;
import parser.PascalBaseListener;
import parser.PascalParser;
import utils.DataType;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PascalListenerImplementation extends PascalBaseListener {
    private FileHandler fileHandler;
    private HashMap<String,Integer> variables ;
    private Stack<Object> stack;
    private List<String> globalVariablesNames;

    public PascalListenerImplementation(){
        variables = new HashMap<String, Integer>();
        fileHandler = new FileHandler("out.s");
        stack = new Stack<Object>();
        globalVariablesNames = new LinkedList<String>();
    }

    @Override
    public void enterProgram(PascalParser.ProgramContext ctx) {
        System.out.println("Entering Program \n");
        fileHandler.writeString("\n\n");
    }

    @Override
    public void exitProgram(PascalParser.ProgramContext ctx) {
        System.out.println("Exiting Program");
        fileHandler.closeFile();
    }

    @Override
    public void enterConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx) {
    }


    @Override
    public void exitConstantDefinition(PascalParser.ConstantDefinitionContext ctx) {
        String constName = ctx.children.get(0).getText();
        String constValue = ctx.children.get(2).getText();
        fileHandler.writeConstantDefinition(constName,constValue);
    }

    @Override
    public void enterVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx) {
        fileHandler.writeString(".data");
    }

    @Override public void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx) {
        DataType dataType = new DataType(ctx.children.get(2).getText());
        for (String s : globalVariablesNames) fileHandler.writeVariableDeclaration(s,dataType);
        globalVariablesNames.clear();
    }

    @Override
    public void exitIdentifierList(PascalParser.IdentifierListContext ctx) {
        ParseTree tmpTree;
        for (int i=0; i< ctx.children.size(); i = i+2){
            tmpTree = ctx.children.get(i);
            globalVariablesNames.add(tmpTree.getText());
        }
    }
}
