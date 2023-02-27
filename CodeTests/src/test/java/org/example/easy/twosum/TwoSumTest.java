package org.example.easy.twosum;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.example.easy.twosum.TwoSum.*;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        assertEquals("0,1", execute(new int[] {2,7,11,15}, 9));
        assertEquals("1,2", execute(new int[] {3,2,4}, 6));
        assertEquals("0,1", execute(new int[] {3,3}, 6));
    }

}