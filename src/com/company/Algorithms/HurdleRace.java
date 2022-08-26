package com.company.Algorithms;

import java.util.List;

public class HurdleRace {
    public static int hurdleRace(int jumpHeight, List<Integer> height) {
        // Write your code here
        int potionsTaken = 0;

        int currentJumpHeight = jumpHeight;

        for (Integer jump : height) {

            System.out.println(currentJumpHeight);
            if (jump > currentJumpHeight) {
                int differenceBetweenHeights = jump - currentJumpHeight;

                System.out.println(differenceBetweenHeights);

                potionsTaken += differenceBetweenHeights;
                currentJumpHeight += differenceBetweenHeights;
            }
        }

        return potionsTaken;
    }
}
