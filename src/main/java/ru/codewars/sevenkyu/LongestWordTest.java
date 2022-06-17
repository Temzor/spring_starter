package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {
    @Test
    public void tests() {
        assertEquals("fgh", LongestWord.longestWord("a b c d e fgh"));
        assertEquals("three", LongestWord.longestWord("one two three"));
        assertEquals("grey", LongestWord.longestWord("red blue grey"));
    }

}