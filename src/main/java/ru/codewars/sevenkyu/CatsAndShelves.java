package ru.codewars.sevenkyu;

public class CatsAndShelves {
    public static int catsAndShelves(int start, int finish) {
        int result = finish - start;
        return result / 3 + result % 3;
    }
}
