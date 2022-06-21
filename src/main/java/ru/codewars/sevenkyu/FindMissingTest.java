package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindMissingTest {

        @Test
        void testIncreasing1() {
            Assertions.assertEquals(3, FindMissing.findMissing(new int[]{1, 2, 4}), "Incorrect answer for [1, 2, 4]");
        }

        @Test
        @DisplayName("Increasing sequence: [1, 3, 4]")
        void testIncreasing2() {
            Assertions.assertEquals(2, FindMissing.findMissing(new int[]{1, 3, 4}), "Incorrect answer for [1, 3, 4]");
        }

        @Test
        @DisplayName("Decreasing sequence: [4, 2, 1]")
        void testDecreasing1() {
            Assertions.assertEquals(3, FindMissing.findMissing(new int[]{4, 2, 1}), "Incorrect answer for [4, 2, 1]");
        }

        @Test
        @DisplayName("Decreasing sequence: [4, 3, 1]")
        void testDecreasing2() {
            Assertions.assertEquals(2, FindMissing.findMissing(new int[]{4, 3, 1}), "Incorrect answer for [4, 3, 1]");
        }

        @Test
        @DisplayName("Constant sequence: [1, 1, 1]")
        void testConstant() {
            Assertions.assertEquals(1, FindMissing.findMissing(new int[]{1, 1, 1}), "Incorrect answer for [1, 1, 1]");
        }
}
