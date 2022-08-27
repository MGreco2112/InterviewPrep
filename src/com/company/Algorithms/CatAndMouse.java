package com.company.Algorithms;

public class CatAndMouse {
    static String catAndMouse(int catAStart, int catBStart, int mousePosition) {
        int aLocationDifference = Math.abs(mousePosition - catAStart);
        int bLocationDifference = Math.abs(mousePosition - catBStart);

        if (aLocationDifference < bLocationDifference) {
            return "Cat A";
        } else if (bLocationDifference < aLocationDifference) {
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }
}
