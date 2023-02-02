package com.company.Algorithms;

import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int output = 0;

        for (int i = 0; i < s.size() - (m - 1); i++) {
            int segment = 0;

            for (int j = i; j < i + m; j++) {
                segment += s.get(j);
            }

            if (segment == d) {
                output++;
            }
        }

        return output;
    }

}
