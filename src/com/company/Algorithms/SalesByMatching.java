package com.company.Algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatching {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> sockMap = new HashMap<>();

        for (Integer sock : ar) {
            if (sockMap.containsKey(sock)) {
                int currentSock = sockMap.get(sock);
                currentSock++;
                sockMap.put(sock, currentSock);
            } else {
                sockMap.put(sock, 1);
            }
        }

        int maxPairs = 0;

        for (Integer pair : sockMap.values()) {

            if (pair >= 2) {
                maxPairs += pair / 2;
            }
        }

        return maxPairs;

    }
}
