package com.company.Algorithms;

import java.util.Arrays;

public class Pangrams {
    public static String pangrams(String s) {
        int[] includedLetters = new int[26];

        String caseNeutralString = s.toLowerCase();

        for (int i = 0; i < caseNeutralString.length(); i++) {
            //97 - 122 && !32

            if (caseNeutralString.charAt(i) != 32) {
                includedLetters[caseNeutralString.charAt(i) - 97]++;
            }
        }

        Arrays.sort(includedLetters);

        if (includedLetters[0] != 0) {
            return "pangram";
        } else {
            return "not pangram";
        }

    }
}
