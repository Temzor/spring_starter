package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithDigitInsideTest {
    public static class solutionTest {
        @Test
        public void BasicTests() {
            assertArrayEquals(new long[]{0, 0, 0}, NumbersWithDigitInside.numbersWithDigitInside(5, 6));
            assertArrayEquals(new long[]{1, 6, 6}, NumbersWithDigitInside.numbersWithDigitInside(7, 6));
            assertArrayEquals(new long[]{3, 22, 110}, NumbersWithDigitInside.numbersWithDigitInside(11, 1));
            assertArrayEquals(new long[]{2, 30, 200}, NumbersWithDigitInside.numbersWithDigitInside(20, 0));
            assertArrayEquals(new long[]{9, 286, 5955146588160L}, NumbersWithDigitInside.numbersWithDigitInside(44, 4));
        }

    }
}