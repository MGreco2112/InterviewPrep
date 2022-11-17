package com.company.ThreeMonthChallenge;

import java.util.*;

public class TowerBreakers {
//    public static int towerBreakers(int n, int m) {
//        // Write your code here
//        int currentPlayer = 0;
//
//        Map<Integer, Integer> towerMap = towerMapBuilder(n, m);
//
//        while (true) {
//
//            currentPlayer++;
//
//            List<Object> keys = Arrays.asList(towerMap.keySet().toArray());
//
//            for (int i = 0; i < keys.size(); i++) {
//                if (towerMap.get(keys.get(i)) != 1) {
//                    int value = towerMap.get(keys.get(i));
//
//                    int maxCommon = Integer.MIN_VALUE;
//
//                    for (int j = 0; j < value; j++) {
//                        if (j % value == 0 && j > maxCommon) {
//                            System.out.println(true);
//
//                            maxCommon = i;
//                        }
//                    }
//
//                    value -= maxCommon;
//
//                    towerMap.put((int) keys.get(i), value);
//
//                    if (value >= 1) {
//                        towerMap.remove(keys.get(i));
//                    }
//
//                    break;
//                }
//            }
//
//
//            if (towerMap.size() <= 0) {
//                break;
//            }
//        }
//
//
//        return currentPlayer % 2 == 0 ? 1 : 2;
//    }
//
//    public static Map<Integer, Integer> towerMapBuilder(int n, int m) {
//        Map<Integer, Integer> towerMap = new HashMap<>();
//
//        for (int i = 1; i <= n; i++) {
//            towerMap.put(i, m);
//        }
//
//        return towerMap;
//    }

    public static int towerBreakers(int n, int m) {
        int total = 0;

        while (m > 1) {
            for (int i = 1; i < m; i++) {
                if (i % m == 0) {
                    System.out.println(true);
                    total = i;

                    m -= i;
                }
            }
        }

        total *= n;


        return total % 2 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(towerBreakers(2, 2));
    }

}
