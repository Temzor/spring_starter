package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModifiedSumTest {
    @Test
    public void basicTests() {
        assertEquals(30, ModifiedSum.modifiedSum(new int[]{1, 2, 3}, 3));
        assertEquals(30, ModifiedSum.modifiedSum(new int[]{1, 2}, 5));
    }
}