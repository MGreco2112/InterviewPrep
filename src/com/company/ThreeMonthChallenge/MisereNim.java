package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MisereNim {
    public static String misereNim(List<Integer> s) {
        // boolean isFirstPlayer = true;
        int playerCount = 0;

        Map<Integer, Integer> stoneMap = new HashMap<>();

        for (int i = 0; i < s.size(); i++) {
            stoneMap.put(i, s.get(i));
        }

        System.out.println(stoneMap);


        while (true) {
            boolean tookStone = false;

            List<Object> stoneMapKeys = Arrays.asList(stoneMap.keySet().toArray());

            for (int i = 0; i < stoneMapKeys.size(); i++) {
                System.out.println(stoneMapKeys.get(i));
                playerCount++;


                if (stoneMap.get(stoneMapKeys.get(i)) != 0) {
                    int value = stoneMap.get(stoneMapKeys.get(i));
                    value--;
                    stoneMap.put((Integer) stoneMapKeys.get(i), value);
                    tookStone = true;

                    break;

                } else {
                    stoneMap.remove(stoneMapKeys.get(i));
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
