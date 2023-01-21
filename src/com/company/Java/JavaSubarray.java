package com.company.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int output = 0;
        int size = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();

        while (list.size() < size) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {

            int subLength = i + 1;

            for (int j = 0; j < list.size(); j++) {

                int subVal = 0;

                for (int k = j; k < subLength; k++) {
                    subVal += list.get(k);
                }

                if (subVal < 0) {
                    output++;
                }

            }
        }

        System.out.println(output);
    }
}
