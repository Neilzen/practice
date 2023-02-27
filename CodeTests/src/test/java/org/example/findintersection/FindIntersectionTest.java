package org.example.findintersection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntersectionTest {

    @Test
    void findIntersection() {
        assertEquals("1,4,13", FindIntersection.execute(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        assertEquals("1,9,10", FindIntersection.execute(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
    }

}