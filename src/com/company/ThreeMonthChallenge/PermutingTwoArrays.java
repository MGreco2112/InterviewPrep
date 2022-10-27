package com.company.ThreeMonthChallenge;

import java.util.List;

public class PermutingTwoArrays {
    /*
        There are two n-element arrays of integers, A and B. Permute them into some and such that the relation holds for all where
        A[i] + B[i] >= K holds for all i where 0 <= n < K.
        There will be n queries consisting of A, B, and K. For each query, return YES if some permutation A, B
        satisfying the relation exists.
        Otherwise, return NO.
    */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        //basic iteration without permutation system implemented
        //next steps:
                //TODO determine how to determine permutation route
                //TODO determine when to implement permutation
                //TODO determine when permutation is finished to check current iterative structure

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) <= k) {
                return "NO";
            }
        }


        return "YES";
    }

    public static void main(String[] args) {

    }

}
