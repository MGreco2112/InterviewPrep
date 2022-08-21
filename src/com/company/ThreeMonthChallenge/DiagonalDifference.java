package com.company.ThreeMonthChallenge;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = arr.size() - 1;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(leftToRight);
            // System.out.println(leftSum);
            rightSum += arr.get(i).get(rightToLeft);
            // System.out.println(rightSum);

            leftToRight++;
            rightToLeft--;
        }

        return Math.abs(leftSum - rightSum);
    }
}
