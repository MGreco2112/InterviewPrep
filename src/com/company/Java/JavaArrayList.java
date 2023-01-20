package com.company.Java;

import java.util.*;

public class JavaArrayList {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        int listSize = Integer.parseInt(scanner.nextLine());

        String numString = scanner.nextLine();

        String[] numArr = numString.split(" ");

        for (int i = 0; i < listSize; i++) {
            numList.add(Integer.parseInt(numArr[i]));
        }

        int queryCount = Integer.parseInt(scanner.nextLine());

        while (queryCount > 0) {
            String operation = scanner.nextLine();

            switch (operation) {
                case "Insert": {
                    String[] elements = scanner.nextLine().split(" ");
                    int index = Integer.parseInt(elements[0]);
                    int element = Integer.parseInt(elements[1]);

                    numList.add(index, element);

                    break;
                }
                case "Delete": {
                    int index = Integer.parseInt(scanner.nextLine());

                    numList.remove(index);
                    break;
                }
            }

            queryCount--;
        }

        for (Integer num : numList) {
            System.out.print(num + " ");
        }

    }
}

