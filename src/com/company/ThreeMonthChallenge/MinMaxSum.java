package com.company.ThreeMonthChallenge;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        //identify the integer with the greatest value in arr
        //identify the integer with the lowest value in arr
        //sum arr ignoring greatest int and store in variable
        //sum arr ignoring least int and store in variable
        //print both variables on one line with a space between

        int minValue = Collections.min(arr);
        int maxValue = Collections.max(arr);

        Long arrSum = 0L;

        for (Integer num : arr) {
            arrSum += num;
            // System.out.println(arrSum);
        }

        System.out.println((arrSum - maxValue) + " " + (arrSum - minValue));

    }

    //REMINDER!!! For very large numbers use the Long class to prevent Overflow
}
