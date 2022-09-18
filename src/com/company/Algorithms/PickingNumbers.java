package com.company.Algorithms;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int streak = 0;
        Integer prevNumber = Integer.MAX_VALUE;

        Collections.sort(a);

        int currentStreak = 1;

        System.out.println(a);

        for (Integer num : a) {

            if (Math.abs(prevNumber - num) <= 1) {
                currentStreak++;
            } else {
                currentStreak = 1;
                prevNumber = num;
            }

            if (currentStreak > streak) {
                streak = currentStreak;
            }

            System.out.println(currentStreak);
        }


        return streak;
    }

}
