package org.example.easy.codelandusernamevalidation;

import org.example.easy.codelandusernamevalidation.CodelandUsernameValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodelandUsernameValidationTest {

    @Test
    void codelandUserNameValidation() {
        assertEquals("false", CodelandUsernameValidation.execute("aa_"));
        assertEquals("true", CodelandUsernameValidation.execute("u__hello_world123"));
    }

}