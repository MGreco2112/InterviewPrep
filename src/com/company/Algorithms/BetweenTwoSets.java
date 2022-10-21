package com.company.Algorithms;

import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int output = 0;

        System.out.println(a);
        System.out.println(b);


        for (Integer numA : a) {
            boolean matchesA = true;

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) % numA != 0) {
                    matchesA = false;
                }
            }

            if (!matchesA) {
                continue;
            }

            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) % numA == 0) {
                    output++;
                }
            }


        }


        return output;
    }
}
