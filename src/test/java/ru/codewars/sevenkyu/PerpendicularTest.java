package ru.codewars.sevenkyu;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PerpendicularTest {
    @Test
    public void basicTests() {
        assertThat(0).isEqualTo(Perpendicular.maxBisectors(0));
        assertThat(0).isEqualTo(Perpendicular.maxBisectors(1));
        assertThat(1).isEqualTo(Perpendicular.maxBisectors(2));
        assertThat(2).isEqualTo(Perpendicular.maxBisectors(3));
        assertThat(4).isEqualTo(Perpendicular.maxBisectors(4));
        assertThat(6).isEqualTo(Perpendicular.maxBisectors(5));
        assertThat(9).isEqualTo(Perpendicular.maxBisectors(6));
        assertThat(650).isEqualTo(Perpendicular.maxBisectors(51));
        assertThat(582401689).isEqualTo(Perpendicular.maxBisectors(48266));
    }
}