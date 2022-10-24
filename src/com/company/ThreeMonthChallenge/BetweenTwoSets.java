package com.company.ThreeMonthChallenge;

import java.util.List;

public class BetweenTwoSets {
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }else{
            return gcd(y,x%y);
        }
    }
    public static int lcm(int x ,int y){
        return(x*y)/gcd(x,y);
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        //get lcm of all elements of a
        int lcm = a.get(0);
        for(Integer integer:a){
            lcm = lcm(lcm,integer);
        }
//get gcd of all elements of b
        int gcd = b.get(0);
        for(Integer integer:b){
            gcd = gcd(gcd,integer);
        }
//count multiples of lcm that divide the gcd
        int multiple =0;
        while(multiple <= gcd){
            multiple +=lcm;//35
            if(gcd % multiple == 0){//
                result++;//6%2==0
            }
        }
        return result;
    }


}
