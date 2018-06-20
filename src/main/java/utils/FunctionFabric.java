package utils;

import utils.functions.StdioFunction;
import utils.functions.StdioWrite;
import utils.functions.StdioWriteln;

import java.util.HashSet;
import java.util.Set;

public class FunctionFabric {

    private static Set<String> stdioFunctions;

    static {
        stdioFunctions = new HashSet<>();
        stdioFunctions.add("write");
        stdioFunctions.add("writeln");

    }

    public static boolean isStdioFunction(String name){
        name = name.toLowerCase();
        return stdioFunctions.contains(name);
    }

    public static StdioFunction createFunction(String functionName){
        if (functionName.toLowerCase().equals("write")) return new StdioWrite();
        else return new StdioWriteln();
    }
}
