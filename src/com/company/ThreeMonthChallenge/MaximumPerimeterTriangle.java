package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        List<Integer> output = new ArrayList<>();

        int currentMax = 0;

        for (int i = 0; i < sticks.size() - 2; i++) {
            if (
                    (sticks.get(i) * sticks.get(i)) +
                            (sticks.get(i + 1) * sticks.get(i + 1)) ==
                            (sticks.get(i + 2) * sticks.get(i + 2)) && sticks.get(i) + sticks.get(i + 1) + sticks.get(i + 2) > currentMax) {
                currentMax = sticks.get(i) + sticks.get(i+1) + sticks.get(i+2);
                output = Arrays.asList(sticks.get(i), sticks.get(i+1), sticks.get(i+2));
            }
        }

        if (currentMax == 0) {
            output = List.of(-1);
        }

        return output;
    }
}
