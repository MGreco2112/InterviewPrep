package com.company.Java;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] arrOne = a.toLowerCase().toCharArray();
        char[] arrTwo = b.toLowerCase().toCharArray();

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] != arrTwo[i]) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");

    }
}
