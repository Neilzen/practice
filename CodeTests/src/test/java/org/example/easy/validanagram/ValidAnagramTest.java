package org.example.easy.validanagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void validAnagram() {
        assertTrue(ValidAnagram.execute("anagram", "nagaram"));
        assertFalse(ValidAnagram.execute("car", "rat"));
    }

}