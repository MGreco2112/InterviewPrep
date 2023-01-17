package com.company.Algorithms;

import java.util.Arrays;

public class FindDigits {
    public static int findDigits(int n) {
        String[] num = Integer.toString(n).split("");

        int result = 0;

        System.out.println(Arrays.toString(num));

        for (int val = 1; val < num.length; val++) {
            int d = Integer.parseInt(num[val]);

            if (d != 0) {
                int value = n%d;

                System.out.println(n%d);

                if (value == 0) {
                    result++;
                }
            }

        }

        return result;

    }
}
