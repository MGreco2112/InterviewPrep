package com.company.Algorithms;

import java.util.List;

public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        char[] wordArr = word.toCharArray();

        int maxHeight = 0;

        for (char letter : wordArr) {
            int currentHeight = h.get((int) letter - 97);

            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
            }
        }

        // subtract by 97, cast as int

        return maxHeight * word.length();

    }
}
