package org.example.firstfactorial;

import org.junit.jupiter.api.Test;

import static org.example.firstfactorial.FirstFactorial.execute;
import static org.junit.jupiter.api.Assertions.*;

class FirstFactorialTest {

    @Test
    void firstFactorial() {
        assertEquals(2, execute(2));
        assertEquals(24, execute(4));
        assertEquals(120, execute(5));
        assertEquals(40320, execute(8));
    }


}