package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntSqRootTest {
    @Test
    public void test0() {
        System.out.println("Fixed Tests");
        assertEquals(4, IntSqRoot.IntRac(25, 1));
        assertEquals(4, IntSqRoot.IntRac(125348, 300), 3);
    }

}