package org.example.easy.validanagram;

public class ValidAnagram {

    public static boolean execute(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        int counter = 0;

        for(int x = 0; x < str1.length(); x++) {
            counter = str1.charAt(x) - str2.charAt(x);
        }

        return counter == 0;
    }

}
