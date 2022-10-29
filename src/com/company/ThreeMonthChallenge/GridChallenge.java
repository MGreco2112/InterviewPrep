package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        List<String> updatedGrid = new ArrayList<>();

        for (String string : grid) {
            char[] arr = string.toCharArray();

            Arrays.sort(arr);

            System.out.println(arr);

            String newStr = "";

            for (int i = 0; i < arr.length; i++) {
                newStr += arr[i];
            }

            updatedGrid.add(newStr);
        }


        for (int i = 0; i < updatedGrid.size() - 1; i++) {

            if (updatedGrid.get(i).charAt(i) > updatedGrid.get(i + 1).charAt(i)) {
                return "NO";
            }

        }


        return "YES";
    }

}
