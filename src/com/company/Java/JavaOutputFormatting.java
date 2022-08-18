package com.company.Java;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%s", s1);

            for (int j = s1.length(); j < 15; j++) {
                System.out.print(" ");
            }

            if (x < 100 && x >= 10) {
                System.out.printf("0%d", x);
            } else if (x < 10) {
                System.out.printf("00%d", x);
            } else {
                System.out.printf("%d", x);
            }

            System.out.print("\n");
        }
        System.out.println("================================");

    }
}
