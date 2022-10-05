package com.company.Algorithms;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if ((arr.get(i) + arr.get(j)) % k == 0) {

                    pairs++;
                }
            }
        }

        return pairs;
    }
}
