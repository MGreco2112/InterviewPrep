package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> rotatedList = new ArrayList<>();

        for (int i = d; i < arr.size(); i++) {
            rotatedList.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            rotatedList.add(arr.get(i));
        }

        return rotatedList;
    }

}
