package ru.codewars.sevenkyu;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class IntSqRootTest {
    @Test
    public void test0() {
        assertThat(4).isEqualTo(IntSqRoot.IntRac(25, 1));
        assertThat(3).isEqualTo(IntSqRoot.IntRac(125348, 300));
    }
}