package org.example.characteroccurence;

import org.example.easy.characteroccurence.CharacterOccurence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterOccurenceTest {

    @Test
    void characterOccurence() {
        assertEquals("DEF", CharacterOccurence.execute("AABBCCDEFGG"));
        assertEquals("", CharacterOccurence.execute("AAAAAAA"));
        assertEquals("BCDEF", CharacterOccurence.execute("AABCAADEF"));
    }

}