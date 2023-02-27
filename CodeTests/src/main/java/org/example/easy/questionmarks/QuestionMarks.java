package org.example.easy.questionmarks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMarks {

    public static String execute(String str) {
        // code goes here
        int indexA = 0;
        int scope = 0;

        Pattern numberPattern = Pattern.compile("[0-9]");

        for(int x = 0; x < str.length(); x++) {
            String element = String.valueOf(str.charAt(x));
            if(numberPattern.matcher(element).matches()) {
                if(0 == scope) {
                    indexA = Character.getNumericValue(str.charAt(x));
                } else if (3 == scope && (10 == indexA + Integer.parseInt(element))) {
                    return "true";
                } else {
                    indexA = 0;
                    scope = 0;
                }
            }

            if('?' == str.charAt(x) && 0 != indexA) {
                scope++;
            }
        }

        return "false";
    }

}
