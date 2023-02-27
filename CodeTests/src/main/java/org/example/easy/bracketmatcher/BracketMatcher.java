package org.example.easy.bracketmatcher;

import java.util.Stack;

public class BracketMatcher {

    public static String execute(String str) {
        // code goes here
        char opening = '(';
        char closing = ')';

        Stack<Character> bracketStack = new Stack<>();

        int startingIndex = str.indexOf(opening);

        if(startingIndex < 0) {
            return "0";
        } else {
            for(int x = startingIndex; x < str.length(); x++) {
                char element = str.charAt(x);

                if(opening == element) {
                    bracketStack.addElement(element);
                } else if (closing == element) {
                    if(bracketStack.empty()) {
                        return "0";
                    }
                    bracketStack.pop();
                }
            }
        }

        return bracketStack.empty() ? "1": "0";
    }

}
