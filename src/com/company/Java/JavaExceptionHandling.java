package com.company.Java;

public class JavaExceptionHandling {
    public long power(int n, int p) throws Exception {
        if (Math.abs(n) != n || Math.abs(p) != p) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        long output = 1L;

        while (p > 0) {
            output *= n;
            p--;
        }

        return output;
    }
}
