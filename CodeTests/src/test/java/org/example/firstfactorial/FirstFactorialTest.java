package org.example.firstfactorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstFactorialTest {

    @Test
    void firstFactorial() {
        assertEquals(2, FirstFactorial.execute(2));
        assertEquals(24, FirstFactorial.execute(4));
        assertEquals(120, FirstFactorial.execute(5));
        assertEquals(40320, FirstFactorial.execute(8));
    }


}