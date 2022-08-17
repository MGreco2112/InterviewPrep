package com.company.Java;

import java.util.Scanner;

public class InputOutputII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    //REMINDER!!! Scanners only grab the DataType they are assigned to find, meaning that
    //newLine characters are ignored by commands for ALL non String data.
    //Advance a line in order to start capturing String data, else you will only
    //capture the newLine character
}
