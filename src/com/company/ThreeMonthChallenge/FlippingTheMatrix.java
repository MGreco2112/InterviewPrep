package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingTheMatrix {
    //maximize the sum of the indexes in the upper left quadrant of the matrix
    //rows and columns may be reversed any number of times, but that is the only way the matrix may be altered


    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int sum = 0;

        for (int i = 0; i < matrix.size(); i++) {

            if (matrix.get(i).get(0) < matrix.get(i).get(matrix.get(i).size() - 1)) {
                Collections.reverse(matrix.get(i));
            }

            if (i > 0 && matrix.get(i).get(0) > matrix.get(i - 1).get(0)) {
                Collections.swap(matrix, i - 1, i);
            }
        }

        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = 0; j < matrix.size() / 2; j++) {
                sum += matrix.get(i).get(j);
            }
        }

        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1,2);
        List<Integer> listTwo = Arrays.asList(3,4);

        List<List<Integer>> matrix = new ArrayList<>() {
            {
                add(listOne);
                add(listTwo);
            }
        };


        flippingMatrix(matrix);
    }
}
