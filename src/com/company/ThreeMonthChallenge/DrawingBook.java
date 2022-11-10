package com.company.ThreeMonthChallenge;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        int forwardCount = p / 2;

        int backwardCount = n - p;

        if (backwardCount == 1) {
            backwardCount = n % 2 == 0 ? 1 : 0;
        } else {
            backwardCount = backwardCount / 2;
        }


        return Math.min(forwardCount, backwardCount);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(10, 8));
    }
}
