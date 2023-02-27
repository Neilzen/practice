package org.example.easy.questionmarks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionMarksTest {

    @Test
    void questionMarks() {
        assertEquals("false", QuestionMarks.execute("aa6?9"));
        assertEquals("true", QuestionMarks.execute("acc?7??sss?3rr1??????5"));
        assertEquals("true", QuestionMarks.execute("arrb6???4xxbl5???eee5"));
        assertEquals("true", QuestionMarks.execute("arrb6???3xxbl5???eee5"));
    }

}