package com.company.ThreeMonthChallenge;

import java.util.List;

public class DivisiblePairs {
    public static int divisibleSumPairs(int size, int divisor, List<Integer> ar) {
        int pairs = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((ar.get(i) + ar.get(j)) % divisor == 0 ) {
                    pairs++;
                }
            }
        }

        return pairs;

    }
}
