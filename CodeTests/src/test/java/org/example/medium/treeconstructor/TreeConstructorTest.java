package org.example.medium.treeconstructor;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeConstructorTest {

    @Test
    void treeConstructor() {
        assertEquals("true", TreeConstructor.execute(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
        assertEquals("false", TreeConstructor.execute(new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}));
        assertEquals("true", TreeConstructor.execute(new String[] {"(1,2)", "(2,4)", "(7,2)"}));
        assertEquals("false", TreeConstructor.execute(new String[] {"(1,2)", "(1,4)", "(7,1)"}));
    }

}