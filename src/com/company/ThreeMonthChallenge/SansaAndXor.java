package com.company.ThreeMonthChallenge;

import java.util.List;

public class SansaAndXor {
    public static int sansaXor(List<Integer> arr) {
        int xorValue = 0;
        List<Integer> values = arr;

        for (int i = 0; i < arr.size() - 1; i++) {
            values.add(arr.get(i) ^ arr.get(i + 1));
        }

        for (int i = 0; i < values.size(); i++) {
            xorValue ^= values.get(i);
        }

        return xorValue;
    }

}
