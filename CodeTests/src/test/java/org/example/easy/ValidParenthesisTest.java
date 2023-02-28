package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    void validParenthesis() {
        assertTrue(ValidParenthesis.execute("(, ), [, ], {, }"));
        assertTrue(ValidParenthesis.execute("{,[,(,),],}"));
        assertFalse(ValidParenthesis.execute(")({]"));
    }

}