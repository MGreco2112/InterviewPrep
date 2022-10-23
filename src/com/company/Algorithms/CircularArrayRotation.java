package com.company.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> output = new ArrayList<>();

        int rotation = k % a.size() - 1;

        for (int i = 0; i < a.size(); i++) {
            output.add(a.get(rotation));

            if (rotation == a.size() - 1) {
                rotation = 0;
            } else {
                rotation++;
            }
        }

        return output;
    }
}
