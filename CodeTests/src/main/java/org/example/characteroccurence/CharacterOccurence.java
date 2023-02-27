package org.example.characteroccurence;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CharacterOccurence {

    public static String execute(String str) {
        Set<Character> set = new HashSet<>();
        String result = str;
        for(int x = 0; x < str.length(); x++) {
            char element = str.charAt(x);
            if(!set.contains(element)) {
                set.add(element);
            } else {
                result = result.replace(String.valueOf(str.charAt(x)), "");
            }
        }

        return result;
    }

}
