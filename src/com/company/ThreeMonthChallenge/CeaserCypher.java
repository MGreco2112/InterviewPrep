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

                //determine volume of overflow, then add that to start of sequence

                //capital letters
                if (letterCode > 90 && letterCode < 97) {


                    letterCode = 89 - (90 - letterCode);
                    //lowercase letters
                } else if (letterCode > 122) {

                    letterCode = 96 - (122 - letterCode);
                }

                output += (char) letterCode;

            } else {
                output += letter;
            }
        }

        return output;
    }
}
