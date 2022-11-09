package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxPerimiterTriangle {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < sticks.size() - 2; i++) {
            int tempA = sticks.get(i);
            int tempB = sticks.get(i + 1);
            int tempC = sticks.get(i + 2);

            if (tempA + tempB > tempC && tempB + tempC > tempA && tempA + tempC > tempB) {
                a = tempA;
                b = tempB;
                c = tempC;
            }
        }

        if (a == 0) {
            return List.of(-1);
        }



        return Arrays.asList(a, b, c);
    }

}
