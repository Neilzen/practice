package org.example.easy.romannumerals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {

    private static final Map<Character, Integer> romanToIntegerMap = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static final Map<Integer, String> integerToRomanMap = new TreeMap<Integer, String>(Collections.reverseOrder()) {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static int execute(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int value = romanToIntegerMap.get(str.charAt(i));
            if (i < str.length() - 1 && value < romanToIntegerMap.get(str.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

}
