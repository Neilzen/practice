package org.example.easy.firstreverse;

import java.util.Stack;

public class FirstReverse {

    public static String execute(String str) {
        // code goes here
        return new StringBuilder(str).reverse().toString();
    }

    public static String executeWithStack(String str) {
        Stack<String> stack = new Stack();

        for(char element: str.toCharArray()) {
            stack.addElement(String.valueOf(element));
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }


}
