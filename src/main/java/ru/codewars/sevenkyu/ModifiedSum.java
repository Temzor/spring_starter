package ru.codewars.sevenkyu;

public class ModifiedSum {
    public static int modifiedSum(int[] array, int power) {
        int sumOne = 0;
        int sumTwo = 0;

        for (int i : array) {
            sumOne += Math.pow(i, power);
            sumTwo += i;
        }
        return  sumOne - sumTwo;
    }
}
