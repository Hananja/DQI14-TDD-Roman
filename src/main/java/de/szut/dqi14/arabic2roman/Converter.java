package de.szut.dqi14.arabic2roman;

import java.util.TreeMap;

public class Converter {
    private final TreeMap<Integer, String> romanMap;

    Converter() {
        romanMap = new TreeMap<Integer, String>(
                (a, b) -> Integer.compare(b, a)
        );
        romanMap.put(1, "I");
        romanMap.put(2, "II");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(20, "XX");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(200, "CC");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");
        romanMap.put(2000, "MM");
    }

    public String convert(int i) {
        StringBuilder stringBuilder = new StringBuilder();

        for( int key: romanMap.keySet()) {
            if( key <= i ) {
                stringBuilder.append(romanMap.get(key));
                i = i - key;
            }
        }

        return stringBuilder.toString();
    }
}
