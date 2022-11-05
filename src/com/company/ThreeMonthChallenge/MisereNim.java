package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MisereNim {
    public static String misereNim(List<Integer> s) {
        boolean isFirstPlayer = true;

        Map<Integer, Integer> stoneMap = new HashMap<>();

        for (int i = 0; i < s.size(); i++) {
            stoneMap.put(i, s.get(i));
        }


        while (true) {
            boolean tookStone = false;

            for (Integer index : stoneMap.keySet()) {
                if (stoneMap.get(index) != 0) {
                    int value = stoneMap.get(index);
                    value--;
                    stoneMap.put(index, value);
                    tookStone = true;
                }
            }
            //this system is not functioning as designed
            isFirstPlayer = !isFirstPlayer;

            if (!tookStone) {
                break;
            }


            System.out.println(isFirstPlayer);
        }

        return isFirstPlayer ? "First" : "Second";
    }
}
