package ru.codewars.sevenkyu;

import java.util.Arrays;

public class ChoreAssignments {
    public static int[] choreAssignments(int[] chores) {
        int[] ints = new int[chores.length / 2];
        Arrays.sort(chores);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = chores[i] + chores[chores.length - i - 1];
            System.out.println(Arrays.toString(ints));

        }
        Arrays.sort(ints);
        return ints;
    }
}
