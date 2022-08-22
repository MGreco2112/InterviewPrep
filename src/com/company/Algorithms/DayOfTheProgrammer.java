package com.company.Algorithms;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {

        if (year == 1918) {
            return "26.09.1918";
        }

        final int DAY_OF_PROGRAMMER = 256;
        final String MONTH = "09";
        System.out.println(year);

        boolean isJulian = year < 1918 ? true : false;
        boolean isLeapYear;

        if (isJulian) {
            isLeapYear = year % 4 == 0 ? true : false;
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        }

        System.out.println(isLeapYear);

        int day = isLeapYear ? 12 : 13;






        return Integer.toString(day) + "." + MONTH + "." + Integer.toString(year);
    }
}
