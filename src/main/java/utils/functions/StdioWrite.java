package utils.functions;

import utils.DataType;

import java.util.List;

public class StdioWrite implements StdioFunction{

    private List<DataType> argumentTypesList;
    private StringBuffer buffer;

    public StdioWrite() {
        super();
        buffer = new StringBuffer();
    }

    @Override
    public String getFunctionDesignator() {
        return buffer.toString();
    }

    @Override
    public void setParameterList(List<DataType> parameterList) {
        argumentTypesList = parameterList;
    }

    @Override
    public void processParameters() {
        buffer.append("printf(");
        if (argumentTypesList.size() > 0){
            buffer.append("\"");

            for (DataType type : argumentTypesList){
                buffer.append(type.getStdioFormat());
            }

            buffer.append("\"");
        }

    }
}
