package utils;

import java.util.HashMap;
import java.util.Map;

public class DataType {
    private static Map<String,String> typesMap;

    static {
        typesMap = new HashMap<String, String>();
        typesMap.put("INTEGER", ".dword 0");
        typesMap.put("CHAR", ".byte 0");
        typesMap.put("BOOLEAN", ".byte 0");
    }

    private String value;

    public DataType(String value) {
        this.value = value.toUpperCase();
    }

    @Override
    public String toString() {
        return typesMap.get(value);
    }
}
