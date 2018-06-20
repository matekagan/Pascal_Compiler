package utils;

import Implementation.BaseListener;
import parser.PascalBaseListener;
import parser.PascalParser;

import java.util.LinkedList;
import java.util.List;

public class ExpressionTypesExtractor {
    private List<String> typeNamesList;
    private PascalParser.ParameterListContext extractRoot;
    private BaseListener listener;


    public ExpressionTypesExtractor(PascalParser.ParameterListContext extractRoot, BaseListener listener) {
        this.extractRoot = extractRoot;
        typeNamesList = new LinkedList<>();
        this.listener = listener;
    }

    public List<DataType> getDataTypesList(){
        createTypesList();
        List<DataType> list = new LinkedList<>();
        for (String s : typeNamesList) list.add(new DataType(s));
        return list;
    }

    private void createTypesList(){
        for (PascalParser.ActualParameterContext ac : extractRoot.actualParameter()){
            typeNamesList.add(extractParameterTypefromExpression(ac.expression()));
        }
    }

    private String extractParameterTypefromExpression(PascalParser.ExpressionContext parameter){
        if (parameter.getChildCount() > 2) return "INTEGER";
        else {
            return extractParameterTypeFromSimpleExpression(parameter.simpleExpression(0));
        }
    }

    private String extractParameterTypeFromSimpleExpression(PascalParser.SimpleExpressionContext expression){
        if (expression.OR() != null) return "INTEGER";
        else {
            return extractParameterTypeFromTerm(expression.term(0));
        }
    }

    private String extractParameterTypeFromTerm(PascalParser.TermContext term){
        if (term.AND() != null) return "INTEGER";
        else if (term.DIV() != null || term.MOD() != null) return "INTEGER";
        else return extractParameterTyprFromFactor(term.signedFactor(0).factor());
    }

    private String extractParameterTyprFromFactor(PascalParser.FactorContext factor){
        if (factor.unsignedConstant() != null) return extractParameterTypeFromUnsignedConstant(factor.unsignedConstant());
        else if (factor.expression() != null) return extractParameterTypefromExpression(factor.expression());
        else if (factor.NOT() != null) return "INTEGER";
        else if (factor.variable() != null){
            if (listener.functionVariables.containsKey(factor.variable().getText()))
                return listener.functionVariables.get(factor.variable().getText());
            else return listener.globalVariables.get(factor.variable().getText());
        } else
            return listener.functions.get(factor.functionDesignator().identifier().getText());

    }

    private String extractParameterTypeFromUnsignedConstant(PascalParser.UnsignedConstantContext constant){
        if (constant.string() != null) return "STRING";
        else {
            PascalParser.UnsignedNumberContext number = constant.unsignedNumber();
            if (number.unsignedInteger() != null) return "INTEGER";
            else return "REAL";
        }
    }

}
