package com.company.Java;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        StringBuilder output = new StringBuilder();

        int counter = 1;

        while (scanner.hasNext()) {
            output.append(counter++ + " " + scanner.nextLine() + "\n");
        }

        scanner.close();

        System.out.println(output);

    }

}
