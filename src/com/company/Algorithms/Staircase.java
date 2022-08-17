package com.company.Algorithms;

public class Staircase {
    public static void staircase(int n) {
        // Write your code here
        StringBuilder staircase = new StringBuilder();

        int hashPoint = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < hashPoint) {
                    staircase.append(" ");
                } else {
                    staircase.append("#");

                    if ((j + 1) >= n) {
                        staircase.append("\n");
                    }
                }
            }

            hashPoint--;
        }

        System.out.println(staircase);
    }
}
