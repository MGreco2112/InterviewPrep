package com.company.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> output = new ArrayList();

        for (int i = 0; i < player.size(); i++) {
            int score = player.get(i);
            int rank = 1;

            ranked.add(score);
            Collections.sort(ranked);
            Collections.reverse(ranked);

            for (int j = 0; j < ranked.size(); j++) {
                if (j != 0 && ranked.get(j - 1) != ranked.get(j)) {
                    rank++;
                }

                if (score == ranked.get(j)) {
                    output.add(rank);
                    break;
                }
            }
        }

        System.out.println(ranked);

        return output;

    }
}
