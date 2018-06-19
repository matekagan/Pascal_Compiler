package utils;

import java.util.HashMap;
import java.util.Map;

public class DataType {
    private static Map<String,String> typesMap;

    static {
        typesMap = new HashMap<String, String>();
        typesMap.put("INTEGER", "int");
        typesMap.put("CHAR", "char");
        typesMap.put("BOOLEAN", "bool");
        typesMap.put("REAL", "float");
        typesMap.put("STRING", "char*");
    }

    private String value;

    public DataType(String value) {
        this.value = value.toUpperCase();
    }

    public boolean isInitialized(){
        return typesMap.containsKey(value);
    }

    @Override
    public String toString() {
        return typesMap.get(value) == null ? "" : typesMap.get(value);
    }

    public static DataType getDataTypeFromValue(String value){
        value = value.trim();
        if (value.toLowerCase().matches("^true|false$")) return new DataType("BOOLEAN");
        else if (value.matches("^\\d+$")) return new DataType("INTEGER");
        else if (value.matches("^\\d*.\\d+$")) return new DataType("REAL");
        else if (value.matches("^\'.\'$")) return new DataType("CHAR");
        else if (value.matches("^\'.*\'$")) return new DataType("STRING");
        else return null;
    }
}
