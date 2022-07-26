package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeZeroValidatorTest {
    @Test
    public void basic_tests() throws Exception {
        assertTrue(NegativeZeroValidator.isNegativeZero(-0f), "");
        assertFalse(NegativeZeroValidator.isNegativeZero(0f), "");
    }
}