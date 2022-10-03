package com.company.ThreeMonthChallenge;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivisionTwo {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int output = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int count = 0;


            for (int j = 0; j < m; j++) {
                count += s.get(j + i);

            }

            System.out.println(count);

            if (count == d) {
                output++;
            }
        }


        return output;
    }

}
