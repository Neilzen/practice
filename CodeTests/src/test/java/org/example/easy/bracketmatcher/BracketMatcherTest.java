package org.example.easy.bracketmatcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketMatcherTest {

    @Test
    void bracketMatcher() {
        assertEquals("1", BracketMatcher.execute("(hello (world))"));
        assertEquals("0", BracketMatcher.execute("((hello (world))"));
        assertEquals("0", BracketMatcher.execute("(coder)(byte))"));
        assertEquals("1", BracketMatcher.execute("(c(oder)) b(yte)"));
    }

}