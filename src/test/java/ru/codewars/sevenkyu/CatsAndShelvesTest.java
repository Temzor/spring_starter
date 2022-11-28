package ru.codewars.sevenkyu;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CatsAndShelvesTest {
    @Test
    @DisplayName("five ends")
    void sampleTest() {
        assertThat(2).isEqualTo(CatsAndShelves.catsAndShelves(1, 5));
    }

    @Test
    @DisplayName("many ends")
    void secondTest() {
        assertThat(117).isEqualTo(CatsAndShelves.catsAndShelves(308, 657));
    }
}