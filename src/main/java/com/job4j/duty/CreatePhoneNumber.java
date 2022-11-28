package com.job4j.duty;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] number) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(number).boxed().toArray());
    }
}
