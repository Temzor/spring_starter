package ru.codewars.sevenKyu;

import static java.util.stream.IntStream.of;

public class LostSheep {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        return sheepTotal - of(fridayNightCounting).sum() - of(saturdayNightCounting).sum();
    }
}
