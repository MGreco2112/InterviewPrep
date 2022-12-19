package com.company.Java;

public class OneDArrayPart2 {
    public static boolean canWin(int leap, int[] game) {

        for (int i = 1; i < game.length;) {
            if (i + 1 >= game.length || i + leap >= game.length) {
                return true;
            }

            if (game[i+1] == 0) {
                i++;
            } else if (game[i+leap] == 0) {
                i += leap;
            } else if (game[i-1] == 0) {
                i--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] game = {0,0,1,1,1,0};

        System.out.println(canWin(6, game));
    }
}
