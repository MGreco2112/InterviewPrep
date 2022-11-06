package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MisereNim {
    public static String misereNim(List<Integer> s) {
        // boolean isFirstPlayer = true;
        int playerCount = 1;

        Map<Integer, Integer> stoneMap = new HashMap<>();

        for (int i = 0; i < s.size(); i++) {
            stoneMap.put(i, s.get(i));
        }

        System.out.println(stoneMap);


        while (true) {
            boolean tookStone = false;

            for (Integer index : stoneMap.keySet()) {
                System.out.println(index);
                playerCount++;


                if (stoneMap.get(index) != 0) {
                    int value = stoneMap.get(index);
                    value--;
                    stoneMap.put(index, value);
                    tookStone = true;

                    break;

                }

            }

            if (!tookStone) {
                System.out.println("break");
                break;
            }

            System.out.println("PlayerCount: " + playerCount);
        }

        return playerCount % 2 == 0 ? "First" : "Second";
    }
}
