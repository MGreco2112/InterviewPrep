package com.company.Algorithms;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCandle = Collections.max(candles);
        int numberOfTallCandles = 0;

        for (Integer candle : candles) {
            if (candle == tallestCandle) {
                numberOfTallCandles++;
            }
        }

        return numberOfTallCandles;

    }
}
