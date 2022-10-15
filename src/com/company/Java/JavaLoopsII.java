package com.company.Java;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;

            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }

            System.out.print("\n");
        }
        in.close();
    }

    //thing to keep in mind: Observe the problem. I overlooked that the 'a' is only factored in during the first process
}
