package com.company.Java;

public class VarargsAddition {
    public void add(int... values) {
        int[] args = values.clone();
        int sum = args[0] + args[1];
        String nums = args[0] + "+" + args[1];

        for (int i = 2; i < args.length; i++) {
            sum += args[i];
            nums += "+" + args[i];

        }

        System.out.println(nums + "=" + sum);

    }
}
