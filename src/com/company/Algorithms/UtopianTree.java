package com.company.Algorithms;

public class UtopianTree {
    public static int utopianTree(int n) {
        int tree = 1;
        int cycle = 0;

        while (cycle < n) {
            if (cycle % 2 == 0) {
                tree += tree;
            } else {
                tree++;
            }
            System.out.println(cycle);
            cycle++;
        }

        return tree;

    }
}
