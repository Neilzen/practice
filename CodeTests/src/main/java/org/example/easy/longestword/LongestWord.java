package org.example.easy.longestword;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {

    public static String execute(String sen) {
        // code goes here
        String longest = "";

        Pattern pattern = Pattern.compile("[^a-zA-Z\\s]");
        Matcher matcher = pattern.matcher(sen);

        String cleaned = matcher.replaceAll("");
        String[] words = cleaned.split(" ");

        for(int x = 0; x < words.length; x++) {
            String word = words[x];
            if(longest.length() < word.length()) {
                longest = word;
            }
        }

        return longest;
    }

}
