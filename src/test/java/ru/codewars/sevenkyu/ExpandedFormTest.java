package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class ExpandedFormTest {
    @Test
    public void testSomething() {
        assertThat("2").isEqualTo(ExpandedForm.expandedForm(2));
        assertThat("10").isEqualTo(ExpandedForm.expandedForm(10));
        assertThat("10 + 2").isEqualTo(ExpandedForm.expandedForm(12));
        assertThat("40 + 2").isEqualTo(ExpandedForm.expandedForm(42));
        assertThat("70000 + 300 + 4").isEqualTo(ExpandedForm.expandedForm(70304));
        assertThat("100000 + 70000 + 300 + 4").isEqualTo(ExpandedForm.expandedForm(170304));
    }
}