package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {
        int totalPairs = 0;
        Map<Integer,Integer> sockPairs = new HashMap<>();

        for (Integer sock : ar) {
            if (sockPairs.containsKey(sock)) {
                int value = sockPairs.get(sock);
                value++;
                sockPairs.put(sock, value);

                if (value % 2 == 0) {
                    totalPairs++;
                }
            } else {
                sockPairs.put(sock, 1);
            }
        }

        return totalPairs;

    }
}
