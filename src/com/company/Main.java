package com.company;

import com.company.ThreeMonthChallenge.ConnectedGroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> listA = Arrays.asList(1,1,0,0);
        List<Integer> listB = Arrays.asList(1,1,1,0);
        List<Integer> listC = Arrays.asList(0,1,1,0);
        List<Integer> listD = Arrays.asList(0,0,0,1);

        outerList.add(listA);
        outerList.add(listB);
        outerList.add(listC);
        outerList.add(listD);

        System.out.println(ConnectedGroups.solution(outerList));
    }
}
