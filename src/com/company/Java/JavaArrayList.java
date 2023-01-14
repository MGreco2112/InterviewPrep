package com.company.Java;

import java.util.*;

public class JavaArrayList {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int listLength = Integer.parseInt(scanner.nextLine());

        List<String> listElements = new ArrayList<>();

        listElements.addAll(Arrays.asList(
                scanner.nextLine().replaceAll(" ", ",").split(",")
        ));

        int queryCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < queryCount; i++) {
            String action = scanner.nextLine();

            switch (action) {
                case "Insert": {
                    String[] commands = scanner.nextLine().split(" ");
                    int index = Integer.parseInt(commands[0]);

                    if (index >= listElements.size()) {
                        while (listElements.size() < index) {
                            listElements.add("0");
                        }
                        listElements.add(commands[1]);
                    } else {
                        listElements.set(index, commands[1]);
                    }

                    break;
                }
                case "Delete": {
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index < listElements.size()) {
                        listElements.remove(index);
                    }

                    break;
                }
            }
        }

        String output = "";

        for (String element : listElements) {
            output += element + " ";
        }

        System.out.println(output.trim());

    }
}

