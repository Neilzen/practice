package org.example.easy.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void romanNumerals() {
        assertEquals(25, RomanNumerals.execute("XXV"));
        assertEquals(36, RomanNumerals.execute("XXXVI"));
        assertEquals(1023, RomanNumerals.execute("MXXIII"));
        assertEquals(542, RomanNumerals.execute("DXLII"));
        assertEquals(49, RomanNumerals.execute("XLIX"));
    }

}