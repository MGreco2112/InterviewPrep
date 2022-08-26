package com.company.ThreeMonthChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] countSort = new int[100];
        // List<Integer> output = new ArrayList<>();

        for (Integer number : arr) {
            countSort[number]++;
        }

        //Two Loop Solution

        // for (int i = 0; i < countSort.length; i++) {
        //     output.add(countSort[i]);
        // }

        //List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());

        //Stack Overflow Solution, researched after base test successful
        return Arrays.stream(countSort).boxed().collect(Collectors.toList());

    }

}
