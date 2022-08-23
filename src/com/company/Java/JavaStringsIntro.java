package com.company.Java;

import java.util.Scanner;

public class JavaStringsIntro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        if (A.charAt(0) > B.charAt(0) || (A.charAt(0) == B.charAt(0) && A.length() > B.length())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
