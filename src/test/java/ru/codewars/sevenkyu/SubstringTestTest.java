package ru.codewars.sevenkyu;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubstringTestTest {
    @Test
    public void shouldBeTrue() {
        assertThat(true).isEqualTo(SubstringTest.substringTest("Something", "Home"));
    }

    @Test
    public void shouldBeTrueSecond() {
        assertThat(true).isEqualTo(SubstringTest.substringTest("BANANA", "banana"));
    }
    @Test
    public void shouldBeFalse() {
        assertThat(false).isEqualTo(SubstringTest.substringTest("Something", "Fun"));
    }

    @Test
    public void shouldBeFalseSecond() {
        assertThat(false).isEqualTo(SubstringTest.substringTest("ujNTKvjksi", "BrNPjuwZgx"));
    }
}