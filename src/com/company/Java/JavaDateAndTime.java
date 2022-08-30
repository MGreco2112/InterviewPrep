package com.company.Java;

import java.util.Calendar;

public class JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        String output = "";

        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month - 1, day);

        int date = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(calendar.get(8));

        //1 - sunday, 7 - saturday

        switch (date) {
            case 1: {
                output = "SUNDAY";
                break;
            }
            case 2: {
                output = "MONDAY";
                break;
            }
            case 3: {
                output = "TUESDAY";
                break;
            }
            case 4: {
                output = "WEDNESDAY";
                break;
            }
            case 5: {
                output = "THURSDAY";
                break;
            }
            case 6: {
                output = "FRIDAY";
                break;
            }
            case 7: {
                output = "SATURDAY";
                break;
            }

        }

        return output;
    }
}
