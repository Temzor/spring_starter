package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("2", ExpandedForm.expandedForm(2));
        assertEquals("10", ExpandedForm.expandedForm(10));
        assertEquals("10 + 2", ExpandedForm.expandedForm(12));
        assertEquals("40 + 2", ExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(70304));
        assertEquals("100000 + 70000 + 300 + 4", ExpandedForm.expandedForm(170304));
    }
}