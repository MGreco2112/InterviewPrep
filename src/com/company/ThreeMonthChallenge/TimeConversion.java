package com.company.ThreeMonthChallenge;

public class TimeConversion {
    public static String timeConversion(String s) {
        String hour = s.substring(0, 2);

        String dayCycle = s.substring(8, 10);

        if (dayCycle.equals("PM") && Integer.parseInt(hour) < 12) {
            hour = Integer.toString(Integer.parseInt(hour) + 12);
        } else if (dayCycle.equals("AM") && Integer.parseInt(hour) == 12) {
            hour = "00";
        }

        return hour + s.substring(2, 8);

    }

    //REMINDER!!! Comparing Strings to String Literals is done with the strVariable.equals() Method
}
