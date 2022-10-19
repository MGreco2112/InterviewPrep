package com.company.ThreeMonthChallenge;

import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);

        System.out.println(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = arr.size() / 2; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int diff = Math.abs(arr.get(i) - arr.get(j));

                if (diff < minDiff) {

                    System.out.println(diff);
                    minDiff = diff;
                }
            }
        }

        return minDiff;



        // int minDiff = Integer.MAX_VALUE;

        // for (int i = 0; i < arr.size(); i++) {
        //     for (int j = i + 1; j < arr.size(); j++) {
        //         int diff = Math.abs(arr.get(i) - arr.get(j));

        //         if (diff < minDiff) {
        //             minDiff = diff;
        //         }
        //     }
        // }

        // return minDiff;

    }
}
