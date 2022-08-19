package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> output = new ArrayList<>();

        for (String query : queries) {
            int total = 0;

            for (String test : strings) {
                if (query.equals(test)) {
                    total++;
                }
            }

            output.add(total);
        }

        return output;
    }
}
