package com.company.Java;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below
            String s = Integer.toString(n);
            //Write your code here


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }

    }
}
