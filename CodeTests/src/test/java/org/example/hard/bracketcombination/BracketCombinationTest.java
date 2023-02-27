package org.example.hard.bracketcombination;

import org.junit.jupiter.api.Test;

import static org.example.hard.bracketcombination.BracketCombination.*;
import static org.junit.jupiter.api.Assertions.*;

class BracketCombinationTest {

    @Test
    void bracketCombination() {
        assertEquals(5, execute(3));
        assertEquals(2, execute(2));
    }

}