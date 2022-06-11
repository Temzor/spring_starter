package ru.codewars.sevenKyu;

public class LostSheep {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        int sumOne = 0;
        int sumTwo = 0;

        for (int i : fridayNightCounting) {
            sumOne += i;
        }

        for (int i : saturdayNightCounting) {
            sumTwo += i;
        }

        return sheepTotal - sumOne - sumTwo;
    }
}
