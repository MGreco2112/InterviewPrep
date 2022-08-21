package com.company.ThreeMonthChallenge;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int count = 0;

        int position = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                position--;
            } else if (path.charAt(i) == 'U' && position == -1) {
                count++;
                position++;
            } else {
                position++;
            }
        }

        return count;
    }
}
