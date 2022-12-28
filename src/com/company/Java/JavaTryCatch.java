package com.company.Java;

import java.util.Scanner;
import java.util.*;

public class JavaTryCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);
        } catch (Exception err) {
            if (err instanceof InputMismatchException) {
                System.out.println("java.util.InputMismatchException");
                return;
            }
            System.out.println(err);
        }
    }
}
