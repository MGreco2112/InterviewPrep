package com.company.ThreeMonthChallenge;

import java.util.Scanner;

public class CamelCaseFour {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        boolean isSplit = false;
        String inputType = "";
        int postHeaderIndex = 4;

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        if (input.substring(0,1).equals("S")) {
            isSplit = true;
        }

        inputType = input.substring(2,3);

        if (inputType.equals("C")) {
            output.append(Character.toUpperCase(input.charAt(postHeaderIndex)));
        } else {
            output.append(input.charAt(postHeaderIndex));
        }

        if (isSplit) {
            for (int i = postHeaderIndex + 1; i < input.length(); i++) {
                if (Character.toLowerCase(input.charAt(i)) != input.charAt(i)) {
                    output.append(" " + Character.toLowerCase(input.charAt(i)));
                } else if (i < input.length() -2){
                    output.append(input.charAt(i));
                }

                if (i >= input.length() - 2 && !inputType.equals("M")) {
                    output.append(input.charAt(i));
                }
            }
        } else {
            for (int i = postHeaderIndex + 1; i < input.length(); i++) {
                //TODO write logic for combining
            }
        }

        System.out.println(output);
    }
}
