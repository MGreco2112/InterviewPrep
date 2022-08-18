package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {

        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

        for (int score = 1; score < scores.size(); score++) {
            if (scores.get(score) < minScore) {
                minScore = scores.get(score);
                minCount++;
            } else if (scores.get(score) > maxScore) {
                maxScore = scores.get(score);
                maxCount++;
            }
        }

        return new ArrayList<>(Arrays.asList(maxCount, minCount));
    }
}
