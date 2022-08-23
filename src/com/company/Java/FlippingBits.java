package com.company.Java;

public class FlippingBits {
    public static long flippingBits(long n) {
        String binString = Long.toBinaryString(n);

        StringBuilder builtString = new StringBuilder();

        //if length of binString < 32
        //add 1s to builtString until builtString.length() ==
        //binString.length() - 32

        System.out.println("Converted to Binary " + binString);

        System.out.println("length conv " + binString.length());

        if (binString.length() < 32) {
            for (int i = 0; i < 32 - binString.length(); i++) {
                builtString.append("1");
            }
        }

        System.out.println("headed ones " + builtString);

        for (int i = 0; i < binString.length(); i++) {
            if (binString.charAt(i) == '0') {
                builtString.append('1');
            } else {
                builtString.append('0');
            }
        }

        System.out.println("Finished flipped bits " + builtString);

        return Long.parseLong(builtString.toString(), 2);
    }
}
