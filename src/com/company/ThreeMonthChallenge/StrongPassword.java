package com.company.ThreeMonthChallenge;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        if (n < 6) {
            return 6 - n;
        }

        int output = 0;

        if (!password.matches("^.*[0-9],*$")) {
            System.out.println(true);
            output++;
        }

        if (!password.matches("^.*[a-z].*$")) {
            System.out.println(true);
            output++;
        }

        if (!password.matches("^.*[A-Z].*$")) {
            System.out.println(true);
            output++;
        }

        if (!password.matches("^.*[!@#$%^&*()-+].*$")) {
            System.out.println(true);
            output++;
        }

        return output;
    }

}
