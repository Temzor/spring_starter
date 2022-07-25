package ru.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InArrayTest {
    @Test
    public void test1() {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[]{"arp", "live", "strong"};
        assertThat(r).containsExactly(InArray.inArray(a, b));
    }

    @Test
    public void test2() {
        String[] a = new String[]{"cod", "code", "wars", "ewar"};
        String[] b = new String[]{"wcod", "scode", "zwars", "xewar", "hewar"};
        String[] r = new String[]{"cod", "code", "ewar", "wars"};
        assertThat(r).containsExactly(InArray.inArray(a, b));
    }
}