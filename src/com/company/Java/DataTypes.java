package com.company.Java;

import java.util.Scanner;

public class DataTypes {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                /*  -32,768 and a maximum value of 32,767
                    -2(31) to 2(31) - 1
                     -2(63) to 2(63) - 1
                */
                if (x >= -32_768 && x <= 32_767) {
                    System.out.println("* short");
                }
                if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1)System.out.println("* int");
                if (x >= Math.pow(-2, 63) && x <= Math.pow(2, 63) - 1)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
