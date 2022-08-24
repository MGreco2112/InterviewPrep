package com.company.Java;

public class MarsExploration {
    public static int marsExploration(String s) {
        //iterate through complete string s
        //comapre position to position in default string
        //if default string position == 4 return dStrPos to 0;
        //increment count if s position char != dStrPos char
        //return count
        String defaultString = "SOS";
        int count = 0;
        int dStrPos = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != defaultString.charAt(dStrPos)) {
                count++;
            }

            if (dStrPos == 2) {
                dStrPos = 0;
            } else {
                dStrPos++;
            }
        }



        return count;

    }

}
