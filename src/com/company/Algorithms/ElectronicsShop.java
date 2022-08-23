package com.company.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        List<Integer> totalOptions = new ArrayList<>();

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int pairTotal = keyboards[i] + drives[j];

                if (pairTotal == b) {
                    return pairTotal;
                }

                if (pairTotal <= b) {
                    totalOptions.add(pairTotal);
                }

            }
        }

        if (totalOptions.size() == 0) {
            return -1;
        }

        return Collections.max(totalOptions);
    }
}
