package com.company.Algorithms;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void extraLongFactorials(int n) {
        BigInteger output = new BigInteger(Integer.toString(n));

        while (n > 1) {

            output = output.multiply(new BigInteger(Integer.toString(n - 1)));

            n--;
        }

        System.out.println(output);
    }

}
