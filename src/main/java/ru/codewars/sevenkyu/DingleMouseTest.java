package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DingleMouseTest {
    @Test
    public void ex() {
        assertArrayEquals(new int[]{1, 9, 6, 3, 0, 1, 1, 1, 1, 1}, DingleMouse.paintLetterboxes(125, 132));
    }

}