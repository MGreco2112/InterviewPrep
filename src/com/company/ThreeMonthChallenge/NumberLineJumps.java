package com.company.ThreeMonthChallenge;

public class NumberLineJumps {
    public static String kangaroo(int start1, int move1, int start2, int move2) {
        // Write your code here
        while (start1 <= start2) {
            if (start1 == start2) {
                return "YES";
            }

            start1 += move1;
            start2 += move2;
        }


        return "NO";
    }
}
