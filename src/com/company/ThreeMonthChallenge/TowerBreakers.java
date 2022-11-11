package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.Map;

public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        int currentPlayer = 0;

        Map<Integer, Integer> towerMap = towerMapBuilder(n, m);




        return currentPlayer % 2 == 0 ? 1 : 2;
    }

    public static Map<Integer, Integer> towerMapBuilder(int n, int m) {
        Map<Integer, Integer> towerMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            towerMap.put(i, m);
        }

        return towerMap;
    }

}
