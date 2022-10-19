package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);

        List<Integer> output = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i + 1)) == minDiff) {
                output.add(arr.get(i));
                output.add(arr.get(i + 1));
            }
        }

        return output;
    }
}
