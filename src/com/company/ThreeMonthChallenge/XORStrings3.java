package com.company.ThreeMonthChallenge;

public class XORStrings3 {
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            //debugged to change '=' to '=='
            if(s.charAt(i) == t.charAt(i))
                //changed assignment operator to concatonator
                res += "0";
            else
                //changed assignment operator to concatonator
                res += "1";
        }

        return res;
    }
}
