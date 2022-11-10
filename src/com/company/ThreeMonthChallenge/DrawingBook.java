package com.company.ThreeMonthChallenge;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        int forwardCount = p / 2;

        int backwardCount = (n - p) / 2;

        if (backwardCount == 1) {
            backwardCount = n % 2 == 0 ? 1 : 0;
        }


        return Math.min(forwardCount, backwardCount);
    }
}
