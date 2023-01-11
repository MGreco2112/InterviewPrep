package com.company.Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here

        int output = 0;

         for (int i = 0; i < pair_left.length; i++) {
             String[] currentPairs = new String[2];

             currentPairs[0] = pair_left[i];
             currentPairs[1] = pair_right[i];


             for (int j = i + 1; j < pair_left.length; j++) {
                 String a = pair_left[j];
                 String b = pair_right[j];


                 if (a.equals(currentPairs[0]) && b.equals(currentPairs[1])) {
                     pair_left[j] = "";
                     pair_right[j] = "";
                 }
             }

             if (!currentPairs[0].equals("")) {
                 output++;
             }

             System.out.println(output);

         }
    }
}
