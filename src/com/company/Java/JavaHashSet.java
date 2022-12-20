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

        Set<String> nameSet = new HashSet<>();

        int output = 0;

        for (int i = 0; i < pair_right.length; i++) {
            if (!nameSet.contains(pair_left[i]) || !nameSet.contains(pair_right[i])) {
                output++;
            }
            nameSet.add(pair_left[i]);
            nameSet.add(pair_right[i]);

            System.out.println(output);
        }

//Not every case passes, need to account for order of elements in pair

    }
}
