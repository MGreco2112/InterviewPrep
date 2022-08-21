package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();

        int returnValue = 0;

        for (Integer num : a) {
            if (map.containsKey(num)) {
                int update = map.get(num) + 1;
                map.put(num, update);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer value : map.keySet()) {
            if (map.get(value) < 2) {
                returnValue = value;
            }
        }

        return returnValue;

    }
}
