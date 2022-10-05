package com.company.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int k = scanner.nextInt();

        String smallest = "";
        String largest = "";

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            StringBuilder sub = new StringBuilder();

            for (int j = 0; j < k; j++) {
                sub.append(s.charAt(i + j));
            }

            substrings.add(sub.toString());
        }

        Collections.sort(substrings);

        smallest = substrings.get(0);

        largest = substrings.get(substrings.size() - 1);


        System.out.println(smallest + "\n" + largest);

    }
}
