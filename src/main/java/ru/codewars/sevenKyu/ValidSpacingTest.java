package ru.codewars.sevenKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidSpacingTest {
    @Test
    void fixedTests() {
        assertFalse(ValidSpacing.validSpacing("codewars "), "'codewars '");
        assertTrue(ValidSpacing.validSpacing("Hello world"), "'Hello world'");
        assertFalse(ValidSpacing.validSpacing(" Hello world"), "' Hello world'");
        assertFalse(ValidSpacing.validSpacing("Hello  world "), "'Hello  world '");
        assertTrue(ValidSpacing.validSpacing("Hello"), "'Hello'");
        assertTrue(ValidSpacing.validSpacing("Helloworld"), "'Helloworld'");
    }

}