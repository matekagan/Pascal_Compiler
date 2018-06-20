package utils.functions;

import utils.DataType;

import java.util.List;

public interface StdioFunction {

    public String getFunctionDesignator();
    public void setParameterList(List<DataType> parameterList);
    public void processParameters();

}
