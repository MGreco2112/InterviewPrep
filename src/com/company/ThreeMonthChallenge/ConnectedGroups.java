package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedGroups {
    public static int[] solution(List<List<Integer>> input) {
        //This method creates an array with each index referencing one person
        //each index holds a number which says how many other people have a connection with that person
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
