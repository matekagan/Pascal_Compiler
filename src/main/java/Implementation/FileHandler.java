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
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeConstantDefinition(String identifier, String value){

        try {
            bufferedWriter.write(".equ ");
            bufferedWriter.write(identifier + ", ");
            bufferedWriter.write(value);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeVariableDeclaration(String identifier, DataType dataType){
        try {
            bufferedWriter.write(identifier + ": ");
            bufferedWriter.write(dataType.toString());
            bufferedWriter.newLine();

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
