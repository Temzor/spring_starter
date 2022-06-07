package ru.codewars.sevenKyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class generateIntegersTest {
    @Test
    public void exampleThree() {
        int m = 1;
        int n = 3;
        int[] expected = new int[]{1, 2, 3};
        Assertions.assertArrayEquals(GenerateIntegers.generateIntegers(m, n), expected);
    }

    @Test
    public void exampleFour() {
        int m = 2;
        int n = 5;
        int[] expected = new int[]{2, 3, 4, 5};
        Assertions.assertArrayEquals(GenerateIntegers.generateIntegers(m, n), expected);
    }
}