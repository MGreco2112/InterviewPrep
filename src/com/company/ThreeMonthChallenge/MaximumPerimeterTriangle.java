package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumPerimeterTriangle {
//    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
//        // Write your code here
//        List<Integer> output = new ArrayList<>();
//
//        int currentMax = 0;
//
//        for (int i = 0; i < sticks.size() - 2; i++) {
//            if (
//                    (sticks.get(i) * sticks.get(i)) +
//                            (sticks.get(i + 1) * sticks.get(i + 1)) ==
//                            (sticks.get(i + 2) * sticks.get(i + 2)) && sticks.get(i) + sticks.get(i + 1) + sticks.get(i + 2) > currentMax) {
//                currentMax = sticks.get(i) + sticks.get(i+1) + sticks.get(i+2);
//                output = Arrays.asList(sticks.get(i), sticks.get(i+1), sticks.get(i+2));
//            }
//        }
//
//        if (currentMax == 0) {
//            output = List.of(-1);
//        }
//
//        return output;
//    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here

        ArrayList<ArrayList<Integer>> triangles = new ArrayList<ArrayList<Integer>>();
        int maxPerimiter = 0;

        //Check triplets incrementally for trianglyness
        for (int i = 0; i < sticks.size()-2; i++){
            final int currentInc = i;

            //MAKE TRIPLE LIST
            ArrayList<Integer> triple = new ArrayList<Integer>() {
                {
                    add(sticks.get(currentInc));
                    add(sticks.get(currentInc+1));
                    add(sticks.get(currentInc+2));
                }
            };

            int sum = triple.get(0)+triple.get(1)+triple.get(2);

            //If is triangly, put that stuff in another array :)
            if(isTriangle(triple) && sum>=maxPerimiter){
                maxPerimiter=sum;
                triangles.add(triple);
            }
        }

        // TODO:
        // Compare remaining triangles and select winner based on largest perimeter
        // and then largest minimum side




        return new ArrayList<Integer>();
    }

    public static boolean isTriangle(ArrayList<Integer> triple){
        /*
            A = triple[0]
            B = triple[1]
            C = triple[2]

            FORMULA:
            a+b >c
            a+c >b
            b+c >a
        */

        if (triple.size() != 3)
            return false;

        int a = triple.get(0);
        int b = triple.get(1);
        int c = triple.get(2);

        if (a+b>c && a+c>b && b+c>a)
            return true;

        return false;
    }
}
