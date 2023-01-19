package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);

        int maxLength = 0;

        for (int i = 0; i < a.size(); i++) {
            int currentCount = 0;
            int pointer = a.get(i);

            for (int j = i + 1; j < a.size(); j++) {
                if (pointer == a.get(j) || pointer + 1 == a.get(j)) {
                    currentCount++;
                }
            }

            if (currentCount > maxLength) {
                maxLength = currentCount;
            }
        }

        return maxLength != 0 ? maxLength + 1 : 0;
    }
}
