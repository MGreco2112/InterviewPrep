package com.company.Java;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int pointer = A.length() - 1;

        boolean isPal = true;

        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(pointer)) {
                System.out.println("No");
                isPal = false;
                break;
            }

            pointer--;
        }

        if (isPal) {
            System.out.println("Yes");
        }


    }
}
