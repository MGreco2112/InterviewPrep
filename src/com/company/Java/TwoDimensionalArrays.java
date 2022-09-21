package com.company.Java;

import java.util.List;

public class TwoDimensionalArrays {
    public static void countingHourglasses(List<List<Integer>> arr) {
        Integer maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
