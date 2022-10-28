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

            String newStr = "";

            for (int i = 0; i < arr.length; i++) {
                newStr += arr[i];
            }

            updatedGrid.add(newStr);
        }

        int pointer = 0;

        for (int i = 0; i < updatedGrid.size() - 2; i++) {
            if (updatedGrid.get(i).charAt(pointer) > updatedGrid.get(i + 1).charAt(pointer + 1)) {
                return "NO";
            }

            pointer++;
        }


        return "YES";
    }

}
