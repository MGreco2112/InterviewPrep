package com.company.ThreeMonthChallenge;

public class CeaserCypher {
    public static String caesarCipher(String s, int k) {
        String output = "";

        for (int i = 0; i < s.length(); i++) {
            //65 - 90
            //97 - 122

            char letter = s.charAt(i);

            if (letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122) {
                int letterCode = letter;

                letterCode += k;

                if (letterCode > 90 && letterCode < 97) {
                    letterCode = 89 + k;
                } else if (letterCode > 122) {
                    letterCode = 96 + k;
                }

                output += (char) letterCode;

            } else {
                output += letter;
            }
        }

        return output;
    }
}
