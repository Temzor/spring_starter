package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumbersWithDigitInsideTest {
    public static class solutionTest {
        @Test
        public void BasicTests() {
            assertThat(new long[]{0, 0, 0}).isEqualTo(NumbersWithDigitInside.numbersWithDigitInside(5, 6));
            assertThat(new long[]{1, 6, 6}).isEqualTo(NumbersWithDigitInside.numbersWithDigitInside(7, 6));
            assertThat(new long[]{3, 22, 110}).isEqualTo(NumbersWithDigitInside.numbersWithDigitInside(11, 1));
            assertThat(new long[]{2, 30, 200}).isEqualTo(NumbersWithDigitInside.numbersWithDigitInside(20, 0));
            assertThat(new long[]{9, 286, 5955146588160L}).isEqualTo(NumbersWithDigitInside.numbersWithDigitInside(44, 4));
        }
    }
}