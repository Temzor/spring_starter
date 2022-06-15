package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    @Test
    public void basicTests() {
        assertTrue(Compare.compare("AD", "BC"));
        assertFalse(Compare.compare("AD", "DD"));
    }
}