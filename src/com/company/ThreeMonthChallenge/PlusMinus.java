package com.company.ThreeMonthChallenge;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        float pos = 0;
        float neg = 0;
        float zero = 0;

        for (Integer inte : arr) {
            if (inte > 0) {
                pos++;
            } else if (inte < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println(pos / arr.size());
        System.out.println(neg / arr.size());
        System.out.println(zero / arr.size());

    }

}
