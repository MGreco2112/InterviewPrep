package com.company.Algorithms;

public class BeautifulDayAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int output = 0;

        for (int day = i; day <= j; day++) {

            int reversedNumber = reverseNumber(day);

            double mathCheck = Math.abs((double)day - reversedNumber) / k;

            if (mathCheck % 1 == 0) {
                output++;
            }
        }

        return output;
    }

    public static int reverseNumber(int number) {
        String forwardNumber = Integer.toString(number);

        String strOutput = "";

        for (int i = forwardNumber.length() - 1; i >= 0; i--) {
            strOutput += forwardNumber.charAt(i);
        }

        return Integer.parseInt(strOutput);
    }

}
