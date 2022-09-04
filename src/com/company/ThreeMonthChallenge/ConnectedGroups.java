package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedGroups {
    public static int[] solution(List<List<Integer>> input) {
        int[] output = new int[input.size()];

        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i).get(j) == 1) {
                    output[i]++;
                }
            }
        }

        return output;
    }
}
