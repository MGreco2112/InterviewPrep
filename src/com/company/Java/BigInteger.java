package com.company.Java;

import java.util.Scanner;
import java.math.*;

public class BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        java.math.BigInteger numOne = new java.math.BigInteger(scanner.nextLine());
        java.math.BigInteger numTwo = new java.math.BigInteger(scanner.nextLine());

        System.out.println(numOne.add(numTwo));
        System.out.println(numOne.multiply(numTwo));

    }
}
