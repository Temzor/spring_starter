package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindSmallestTest {
    @Test
    public void testSample() {
        Assertions.assertEquals(0, FindSmallest.findSmallest(new int[]{1, 2, 3}, "index"), "The smallest index");
        Assertions.assertEquals(2, FindSmallest.findSmallest(new int[]{7, 12, 3, 2, 27}, "value"), "The smallest value");
        Assertions.assertEquals(3, FindSmallest.findSmallest(new int[]{7, 12, 3, 2, 27}, "index"), "The smallest index");
    }
}