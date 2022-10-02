package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);

        System.out.println(a);

        List<Integer> streaks = new ArrayList<>();

        int currentNum = a.get(0);
        int currentStreak = 1;

        for (int i = 1; i < a.size(); i++) {
            System.out.println(a.get(i));
            System.out.println("current num: " + currentNum);

            if (a.get(i) >= currentNum + 1) {
                System.out.println(true);

                streaks.add(currentStreak);
                currentStreak = 1;

                currentNum = a.get(i);
            }

            if (a.get(i) == currentNum || a.get(i) == currentNum + 1) {
                currentStreak++;
            }
        }



        return Collections.max(streaks);
    }
}
