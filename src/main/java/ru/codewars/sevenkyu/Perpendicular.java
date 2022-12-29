package ru.codewars.sevenkyu;

public class Perpendicular {
    public static int maxBisectors(int n) {
        int a = n / 2;
        return n / 2 * (n - a);
    }
}
