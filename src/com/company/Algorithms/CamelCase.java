package com.company.Algorithms;

import java.util.Arrays;

public class CamelCase {
    public static int camelcase(String s) {
        String[] words = s.split("[A-Z]");

        System.out.println(Arrays.toString(words));

        return words.length;

    }}
