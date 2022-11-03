package com.company.ThreeMonthChallenge;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrimeDates {

    //month array stores number of days in selected month
    public static int month[];

    public static void main (String[] args) throws java.lang.Exception {
        Scanner in  = new Scanner(System.in);

        month = new int[15];

        //stores date string of start/end date
        String s = in.nextLine();

        //creates tokens from s String at the "- " character
        StringTokenizer str = new StringTokenizer(s, "- ");

        //creates individual variables for each token of s
        int d1 = Integer.parseInt(str.nextToken());
        int m1 = Integer.parseInt(str.nextToken());
        int y1 = Integer.parseInt(str.nextToken());
        int d2 = Integer.parseInt(str.nextToken());
        int m2 = Integer.parseInt(str.nextToken());
        int y2 = Integer.parseInt(str.nextToken());

        //runs result method on int variables
        int result = findPrimeDates(d1, m1, y1, d2, m2, y2);
        //prints result
        System.out.println(result);
    }

    public static void updateLeapYear(int year) {
        if(year % 400 == 0) {
            month[2] = 29; //leap year also at 400 (1)
        } else if(year % 100 == 0) { //leap year not at 100 (5)
            month[2] = 28;
        } else if(year % 4 == 0) {
            month[2] = 29;
        } else {
            month[2] = 28;
        }
    }

    public static void storeMonth() {
        month[1] = 31;
        month[2] = 28;
        month[3] = 31;
        month[4] = 30;
        month[5] = 31;
        month[6] = 30;
        month[7] = 31;
        month[8] = 31;
        month[9] = 30;
        month[10] = 31;
        month[11] = 30;
        month[12] = 31;
    }

    public static int findPrimeDates(int d1, int m1, int y1, int d2, int m2, int y2) {
        //populates month arr with number of days for each month
        storeMonth();

        //initializes result int variable
        int result = 0;

        while(true) {
            int x = d1;
            x = x * 100 + m1; //what does this and the next factor do?
            x = x * 100 + y1; //removed zero from multiplication (4)
            if(x % 4 == 0 || x % 7 == 0) { //swapped && for || as per condition for problem (2)
                result = result + 1;
            }
            if(d1 == d2 && m1 == m2 && y1 == y2) {
                break;
            }
            updateLeapYear(y1);
            d1 = d1 + 1;
            if(d1 > month[m1]) {
                m1 = m1 + 1;
                d1 = 1;
                if(m1 > 12) {
                    y1 =  y1 + 1;
                    m1 = 1; //reset m1 to 1st Month value after new year rollover (3)
                }
            }
        }
        return result;
    }
}
