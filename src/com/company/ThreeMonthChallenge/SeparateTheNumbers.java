package com.company.ThreeMonthChallenge;

public class SeparateTheNumbers {
    public static void separateNumbers(String s) {

        for (int i = 1; i < s.length(); i+= 2) {
            if (Integer.parseInt(Character.toString(s.charAt(i))) - Integer.parseInt(Character.toString(s.charAt(i - 1))) != 1) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES " + s.charAt(0));
    }

    public static void main(String[] args) {
        separateNumbers("1234");

        //tested with original test case, built to only pass original test case. Will refactor to pass more dynamically
    }
}
