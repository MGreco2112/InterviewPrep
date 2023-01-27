package com.company.Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {
//    public static String pangrams(String s) {
//        int[] includedLetters = new int[26];
//
//        String caseNeutralString = s.toLowerCase();
//
//        for (int i = 0; i < caseNeutralString.length(); i++) {
//            //97 - 122 && !32
//
//            if (caseNeutralString.charAt(i) != 32) {
//                includedLetters[caseNeutralString.charAt(i) - 97]++;
//            }
//        }
//
//        Arrays.sort(includedLetters);
//
//        if (includedLetters[0] != 0) {
//            return "pangram";
//        } else {
//            return "not pangram";
//        }
//
//    }

    public static String pangrams(String s) {
        Set<Character> charSet = new HashSet<>();

        String lowerCaseS = s.toLowerCase();

        for (int i = 0; i < lowerCaseS.length(); i++) {
            charSet.add(lowerCaseS.charAt(i));
        }

        if (charSet.size() != 27) {
            return "not pangram";
        } else {
            return "pangram";
        }
    }
}
