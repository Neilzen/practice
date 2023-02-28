package org.example.easy;

import java.util.Stack;

public class ValidParenthesis {

    private static final String OPENING_BRACKET = "{";
    private static final String CLOSING_BRACKET = "}";
    private static final String OPENING_PARENTHESIS = "(";
    private static final String CLOSING_PARENTHESIS = ")";
    private static final String OPENING_BRACE = "[";
    private static final String CLOSING_BRACE = "]";

    public static boolean execute(String str) {
        Stack<String> stack = new Stack<>();

        for(String element: str.replaceAll(" ", "").split(",")) {
            if(OPENING_BRACKET.equals(element) || OPENING_BRACE.equals(element) || OPENING_PARENTHESIS.equals(element)) {
                stack.addElement(element);
            } else if(CLOSING_BRACKET.equals(element) && OPENING_BRACKET.equals(stack.peek())) {
                stack.pop();
            }  else if(CLOSING_PARENTHESIS.equals(element) && OPENING_PARENTHESIS.equals(stack.peek())) {
                stack.pop();
            } else if(CLOSING_BRACE.equals(element) && OPENING_BRACE.equals(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }

}
