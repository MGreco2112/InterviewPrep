package com.company.Algorithms;

import java.util.List;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int pointer = a.get(i);

            int currentDistance = Integer.MAX_VALUE;
            for (int j = i + 1; j < a.size(); j++) {
                if (pointer == a.get(j)) {
                    currentDistance = Math.abs(i - j);
                }
            }

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }

        return minDistance;

    }

}
