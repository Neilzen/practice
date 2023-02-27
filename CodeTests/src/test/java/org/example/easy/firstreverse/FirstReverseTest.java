package org.example.easy.firstreverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstReverseTest {

    @Test
    void firstReverse() {
        assertEquals("etybredoc", FirstReverse.execute("coderbyte"));
        assertEquals("edoC evoL I", FirstReverse.execute("I Love Code"));

        assertEquals("etybredoc", FirstReverse.executeWithStack("coderbyte"));
        assertEquals("edoC evoL I", FirstReverse.executeWithStack("I Love Code"));
    }

}