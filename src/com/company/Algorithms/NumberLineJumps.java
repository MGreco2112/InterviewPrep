package com.company.Algorithms;

public class NumberLineJumps {
    public static String kangaroo(int kangaStart1, int kangaMove1, int KangaStart2, int kangaMove2) {
        // Write your code here
        int kanga1 = kangaStart1;
        int kanga2 = KangaStart2;

        for (int i = 0; i < 10001; i++) {
            if (kanga1 == kanga2) {
                return "YES";
            }

            kanga1 += kangaMove1;
            kanga2 += kangaMove2;
        }

        return "NO";
    }

}
