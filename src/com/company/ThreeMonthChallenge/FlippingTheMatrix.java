package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingTheMatrix {
    //maximize the sum of the indexes in the upper left quadrant of the matrix
    //


    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        List<Integer> upperLeftQuad = new ArrayList<>();

        for (List<Integer> lists : matrix) {
            Collections.sort(lists);
            Collections.reverse(lists);

            System.out.println(lists);
        }

//        for (int i = 0; i < matrix.size() / 2; i++) {
//            for (int j = 0; j < matrix.size() / 2; j++) {
//                upperLeftQuad.add(matrix.get(i).get(j));
//            }
//        }

//        System.out.println(upperLeftQuad);

        return 0;
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
