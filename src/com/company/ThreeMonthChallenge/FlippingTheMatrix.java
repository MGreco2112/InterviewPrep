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
        List<Integer> upperLeftQuad = new ArrayList<>();

        for (List<Integer> lists : matrix) {
            Collections.sort(lists);
            Collections.reverse(lists);

//            System.out.println(lists);

            for (int i = 0; i < lists.size() / 2; i++) {
                upperLeftQuad.add(lists.get(i));
            }
        }

        Collections.sort(upperLeftQuad);

        int output = 0;

        for (int i = upperLeftQuad.size() - 1; i >= upperLeftQuad.size() / 2; i--) {
            output += upperLeftQuad.get(i);
        }

        System.out.println(output);

        return output;
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
