package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);

        List<Integer> streaks = new ArrayList<>();

        int currentNum = a.get(0);
        int currentStreak = 0;

        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > currentNum) {
                streaks.add(currentStreak);
                currentStreak = 0;
            }

            if (a.get(i) == currentNum || a.get(i) == currentNum + 1) {
                currentStreak++;
            }
        }



        return Collections.max(streaks);
    }

}
