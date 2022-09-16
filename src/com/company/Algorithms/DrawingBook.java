package com.company.Algorithms;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        //if p % 2 == 1
        // last page only on front
        //if the difference between p & n <

        if (p == 1 || p == n) {
            return 0;
        }

        if (Math.abs(n - p) == 1 && n % 2 == 0) {
            return 1;
        }

        int output = 0;

        for (int i = p; i < n; i++) {
            output++;
        }

        int reverseOutput = 0;

        for (int i = p; i >= 1; i--) {
            reverseOutput++;
        }


        return output <= reverseOutput ? output / 2 : reverseOutput / 2;

    }
}
