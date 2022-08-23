package com.company.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxOptions = Integer.MIN_VALUE;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int pairTotal = keyboards[i] + drives[j];

                if (pairTotal == b) {
                    return pairTotal;
                }

                if (pairTotal <= b && pairTotal > maxOptions) {
                    maxOptions = pairTotal;
                }

            }
        }

        if (maxOptions == Integer.MIN_VALUE) {
            return -1;
        }

        return maxOptions;
    }
}
