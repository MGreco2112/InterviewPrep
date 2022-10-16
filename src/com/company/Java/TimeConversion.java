package com.company.Java;

public class TimeConversion {
    public static String timeConversion(String s) {
        String[] splitTime = s.split(":");

        int hour = Integer.parseInt(splitTime[0]);
        String minute = splitTime[1];
        String second = splitTime[2].substring(0, 2);
        String suffix = splitTime[2].substring(2);

        if (suffix.equals("PM") && hour < 12) {
            hour += 12;
        } else if (hour == 12 && suffix.equals("AM")) {
            hour = 0;
        }

        return hour < 12 ? "0" + Integer.toString(hour) + ":" + minute + ":" + second
                :
                hour + ":" + minute + ":" + second;
    }
}
