package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumStepsTest {
    @Test
    public void checkSmallArraySize() {
        doTest(new int[]{4, 6, 3}, 7, 1);
        doTest(new int[]{10, 9, 9, 8}, 17, 1);
    }

    @Test
    public void checkLargerArraySize() {
        doTest(new int[]{8, 9, 4, 2}, 23, 3);
        doTest(new int[]{19, 98, 69, 28, 75, 45, 17, 98, 67}, 464, 8);
        doTest(new int[]{72, 53, 9, 144, 92, 19, 43, 59, 136, 99, 191, 169,
                49, 140, 181, 141, 15, 60, 158, 157, 18, 159, 133, 90, 200, 162, 170, 8, 186, 154, 115, 123, 117, 67, 152, 120, 69, 153, 155, 90, 32, 98, 119, 9, 176, 122}, 153, 7);
    }

    private void doTest(int[] numbers, int k, int expected) {
        assertEquals(expected, MinimumSteps.minimumSteps(numbers, k));
    }
}