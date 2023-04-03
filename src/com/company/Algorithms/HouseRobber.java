package com.company.Algorithms;

public class HouseRobber {

    int solution(int[] nums) {

        int currentMax = 0; //declare current max var
        int prevMax = 0; //declare previous max var

        for(int i = 0; i < nums.length; i++) { //iterate through nums array
            int currentHouse = nums[i]; //set current house to current array index in loop
            int newMax = Math.max(currentMax, prevMax + currentHouse); //generate newMax value from Math.max call
            //on the currentMax, the previousMax, and the currentHouse values
            prevMax = currentMax; //previousMax is equal to the prior currentMax
            currentMax = newMax; //the currentMax is updated to reflect the newMax
        }

        return currentMax;

    }

}
