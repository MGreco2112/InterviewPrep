package com.company.Java;

import java.util.Scanner;

public class StaticInitilizerBlock {
    public static Scanner scanner = new Scanner(System.in);
    public static int B = scanner.nextInt();
    public static int H = scanner.nextInt();


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        boolean flag = B > 0 && H > 0;

        if (flag) {
            System.out.println(B*H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
