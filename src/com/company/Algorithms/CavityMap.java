package com.company.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {
//    public static List<String> cavityMap(List<String> grid) {
//        // Write your code here
//        //loop through index 1 to index size() - 1
//        //loop through index 1 to index size() - 1 of string
//        //if charAt(index) > charAt(index - 1) && charAt(index + 1)
//        //concatinate an X to that string position
//        //then add String to new List
//        //Return new List
//
//        List<String> output = new ArrayList<>();
//
//        output.add(grid.get(0));
//
//        if (grid.size() == 1) {
//            return output;
//        }
//
//        for (int i = 1; i < grid.size() - 1; i++) {
//            String newStr = "";
//
//            for (int j = 0; j < grid.get(i).length(); j++) {
//                char newChar = grid.get(i).charAt(j);
//
//                if (j <= 0 || j >= grid.get(i).length() - 1) {
//                    newStr += newChar;
//                } else {
//                    if (newChar > grid.get(i - 1).charAt(j)
//                            &&
//                            newChar > grid.get(i).charAt(j - 1)
//                            &&
//                            newChar > grid.get(i).charAt(j + 1)
//                            &&
//                            newChar > grid.get(i + 1).charAt(j)) {
//                        newStr += "X";
//                    } else {
//                        newStr += newChar;
//                    }
//                }
//            }
//
//            output.add(newStr);
//        }
//
//        output.add(grid.get(grid.size() - 1));
//
//        return output;
//    }

    //second iteration, utilizing a method
    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        //loop through index 1 to index size() - 1
        //loop through index 1 to index size() - 1 of string
        //if charAt(index) > charAt(index - 1) && charAt(index + 1)
        //concatinate an X to that string position
        //then add String to new List
        //Return new List

        List<String> output = new ArrayList<>();

        output.add(grid.get(0));

        if (grid.size() == 1) {
            return output;
        }

        for (int i = 1; i < grid.size() - 1; i++) {
            String newStr = "";

            for (int j = 0; j < grid.get(i).length(); j++) {
                char newChar = grid.get(i).charAt(j);

                if (j <= 0 || j >= grid.get(i).length() - 1) {
                    newStr += newChar;
                } else {

                    //upper: i - 1, j
                    //target: i, j
                    //lower: i + 1, j
                    //left: i, j - 1
                    //right: i, j + 1
                    if (isTargetLarger(
                            grid.get(i - 1).charAt(j),
                            grid.get(i).charAt(j),
                            grid.get(i + 1).charAt(j),
                            grid.get(i).charAt(j - 1),
                            grid.get(i).charAt(j + 1)
                    )) {
                        newStr += "X";
                    } else {
                        newStr += newChar;
                    }
                }
            }

            output.add(newStr);
        }

        output.add(grid.get(grid.size() - 1));

        return output;
    }

    public static boolean isTargetLarger(char upper, char target, char lower, char left, char right) {
        if (target > upper && target > lower && target > left && target > right) {
            return true;
        }

        return false;
    }
}
