package com.company.Algorithms;

import java.util.Collections;
import java.util.List;

public class HighestHurdle {
    public static int hurdleRace(int k, List<Integer> height) {
        int highestHurdle = Collections.max(height);

        if (k < highestHurdle) {
            return highestHurdle - k;
        } else {
            return 0;
        }

    }
}
