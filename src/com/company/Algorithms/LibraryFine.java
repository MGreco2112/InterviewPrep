package com.company.Algorithms;

public class LibraryFine {
    public static int libraryFine(int day1, int month1, int year1, int day2, int month2, int year2) {
        int output = 0;

        if (day1 <= day2 && month1 <= month2 && year1 <= year2) {
            return 0;
        } else if (day1 > day2 && month1 == month2 && year1 == year2) {
            output = 15 * Math.abs(day1 - day2);
        } else if (month1 > month2 && year1 == year2) {
            output = 500 * Math.abs(month1 - month2);
        } else if (year1 > year2){
            output = 10000;
        }


        return output;
    }
}
