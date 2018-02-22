package de.szut.dqi14.arabic2roman;

import java.util.TreeMap;

public class Converter {
    private final TreeMap<Integer, String> romanMap;

    Converter() {
        romanMap = new TreeMap<Integer, String>(
                (a, b) -> Integer.compare(b, a)
        );
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(20, "XX");
        romanMap.put(40, "XL");
    }

    public String convert(int i) {
        StringBuilder stringBuilder = new StringBuilder();

        for( int key: romanMap.keySet()) {
            if( key <= i ) {
                stringBuilder.append(romanMap.get(key));
                i = i - key;
            }
        }

        for( ; i > 0; i-- ) {
            stringBuilder.append("I");
        }
        return stringBuilder.toString();
    }
}
