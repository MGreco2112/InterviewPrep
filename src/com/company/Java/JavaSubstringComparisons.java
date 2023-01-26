package com.company.Java;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {

        String[] substring = new String[s.length() - (k - 1)];

        for (int i = 0; i < s.length() - k + 1; i++) {
            String sub = "";

            for (int j = i; j < i + k && j < s.length(); j++) {
                sub += s.charAt(j);
            }

            substring[i] = sub;
        }

        for (int i = 0; i < substring.length - 1; i++) {

            if (substring[i].charAt(0) > substring[i+1].charAt(0)) {
                String temp = substring[i];
                substring[i] = substring[i+1];
                substring[i+1] = temp;
                i = -1;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return substring[0] + "\n" + substring[substring.length - 1];
    }

}
