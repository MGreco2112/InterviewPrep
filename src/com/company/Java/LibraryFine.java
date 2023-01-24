package com.company.Java;

public class LibraryFine {
    public static int libraryFine(int day1, int month1, int year1, int day2, int month2, int year2) {
// Write your code here

        int fine = 0;

        if (day1 <= day2 && month1 <= month2 && year1 <= year2) {
            fine = 0;
        } else if (day1 > day2 && month1 <= month2 && year1 <= year2) {
            fine = Math.abs(day1 - day2) * 15;
        } else if (month1 > month2 && year1 <= year2) {
            fine = Math.abs(month1 - month2) * 500;
        } else {
            fine = 10000;
        }

        return fine;

    }

}

