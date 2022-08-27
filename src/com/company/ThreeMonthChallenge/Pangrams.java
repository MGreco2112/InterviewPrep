package com.company.ThreeMonthChallenge;

import java.util.HashMap;
import java.util.Map;

public class Pangrams {

    public static String pangrams(String s) {
        Map<Character, Integer> alphabet = new HashMap<>();

        final int ALPHABET_COUNT_PLUS_SPACE = 27;

        String casedString = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            if (!alphabet.containsKey(casedString.charAt(i))) {
                alphabet.put(casedString.charAt(i), 1);
            }
        }

        System.out.println(alphabet.keySet().size());

        if (alphabet.keySet().size() != ALPHABET_COUNT_PLUS_SPACE) {
            return "not pangram";
        }

        return "pangram";

    }
}
