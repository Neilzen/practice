package org.example.easy.bracketcombination;

public class BracketCombination {

    public static int execute(int n) {
        if (n <= 0) {
            return 0;
        }
        char[] brackets = new char[n*2];
        return generate(brackets, 0, n, n, 0);
    }

    private static int generate(char[] brackets, int index, int open, int close, int iteration) {
        if (index == brackets.length) {
            return ++iteration;
        }

        if (open > 0) {
            brackets[index] = '(';
            iteration = generate(brackets, index+1, open-1, close, iteration);
        }

        if (close > open) {
            brackets[index] = ')';
            iteration = generate(brackets, index+1, open, close-1, iteration);
        }
        return iteration;
    }

}
