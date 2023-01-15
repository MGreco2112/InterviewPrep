package com.company.Algorithms;

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int annaDeclineIndex, int annaPay) {
        // Write your code here
        int total = 0;
        int adjustedBill = 0;

        for (Integer cost : bill) {
            total += cost;
        }

        adjustedBill = Math.abs(total - bill.get(annaDeclineIndex)) / 2;

        if (annaPay == adjustedBill) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(Math.abs(adjustedBill - annaPay));
        }
    }
}
