package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InArrayTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, InArray.inArray(a, b));
    }
}