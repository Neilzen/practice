package org.example.easy.codelandusernamevalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUsernameValidation {

    public static String execute(String str) {
        // Check length
        if (str.length() < 4 || str.length() > 25) {
            return "false";
        }

        // Check first character
        char firstChar = str.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return "false";
        }

        // Check last character
        char lastChar = str.charAt(str.length() - 1);
        if (lastChar == '_') {
            return "false";
        }

        // Check for invalid characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9_]");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "false";
        }

        return "true";
    }


}
