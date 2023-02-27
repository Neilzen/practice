package org.example.easy.longestword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {

    @Test
    void longestWord() {
        assertEquals("time", LongestWord.execute("fun&!! time"));
        assertEquals("love", LongestWord.execute("I love dogs"));
    }

}