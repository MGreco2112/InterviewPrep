package com.company.ThreeMonthChallenge;

import java.util.*;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdMap = new HashMap<>();

        for (Integer bird : arr) {
            if (birdMap.containsKey(bird)) {
                int count = birdMap.get(bird);
                count++;
                birdMap.put(bird, count);
            } else {
                birdMap.put(bird, 1);
            }
        }

        List<Integer> birdList = new ArrayList<>();

        int currentMax = Collections.max(birdMap.values());

        for (Integer bird : birdMap.keySet()) {
            if (birdMap.get(bird) >= currentMax) {
                currentMax = birdMap.get(bird);
                birdList.add(bird);
            }
        }

        return birdList.size() > 1 ? Collections.min(birdList) : birdList.get(0);

    }
}
