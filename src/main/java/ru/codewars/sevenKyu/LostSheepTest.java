package ru.codewars.sevenKyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LostSheepTest {
    @Test
    public void basicTests() {
        assertEquals(5, LostSheep.lostSheep(new int[]{1, 2}, new int[]{3, 4}, 15));
        assertEquals(6, LostSheep.lostSheep(new int[]{3, 1, 2}, new int[]{4, 5}, 21));
    }
}