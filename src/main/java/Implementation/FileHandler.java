package Implementation;

import utils.DataType;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private BufferedWriter bufferedWriter;

    public FileHandler(String fileName) {

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeString(String str) {
        try {
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeConstantDefinition(String identifier, String value, boolean global){
        DataType type;
        try {
            if (!global){
                type = DataType.getDataTypeFromValue(value);
                bufferedWriter.write("const ");
                bufferedWriter.write(type.toString());
                bufferedWriter.write(" ");
                bufferedWriter.write(identifier + " = ");
                bufferedWriter.write(value);
                bufferedWriter.write(";");
                bufferedWriter.newLine();
            }
            else {
                bufferedWriter.write("#define ");
                bufferedWriter.write(identifier);
                bufferedWriter.write(" ");
                bufferedWriter.write(value);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeVariableDeclaration(String identifierList, DataType dataType){
        try {
            bufferedWriter.write(dataType.toString());
            bufferedWriter.write(" ");
            bufferedWriter.write(identifierList + ";");
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeParameterDeclaration(String identifier, DataType type, boolean first){
        try {
            if (!first) bufferedWriter.write(", ");
            bufferedWriter.write(type.toString());
            bufferedWriter.write(" ");
            bufferedWriter.write(identifier);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeForStatement(String identifier, String initialValue, String finalValue, String[] signs){
        try {
            bufferedWriter.write("\nfor(int ");
            bufferedWriter.write(identifier);
            bufferedWriter.write(" = ");
            bufferedWriter.write(initialValue);
            bufferedWriter.write("; ");
            bufferedWriter.write(identifier);
            bufferedWriter.write(" " + signs[0] + " ");
            bufferedWriter.write(finalValue);
            bufferedWriter.write("; ");
            bufferedWriter.write(identifier);
            bufferedWriter.write(signs[1] + " ");
            bufferedWriter.write(")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile(){
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
