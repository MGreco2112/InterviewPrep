package com.company.AdventOfCode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CalorieCounting {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);

        System.out.println(new File(".").getAbsoluteFile());

        BufferedReader reader = new BufferedReader(new FileReader("src/com/company/AdventOfCode/text/calories.txt"));

        List<Integer> mainList = new ArrayList<>();
        System.out.println("Paste in nonsense:");


        Long maxSum = Long.MIN_VALUE;
        Long sum = 0L;

        while (reader.ready()) {
            String val = reader.readLine();

            System.out.println("value: " + val);

            if (!Objects.equals(val, "")) {
                sum += Long.parseLong(val);
            } else {

                if (sum > maxSum) {
                    maxSum = sum;
                }

                sum = 0L;
            }

        }

        System.out.println(maxSum);

    }

}
