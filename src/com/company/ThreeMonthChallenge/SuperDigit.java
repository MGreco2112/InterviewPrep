package com.company.ThreeMonthChallenge;

public class SuperDigit {
    public static int superDigit(String n, int k) {
        if (n.length() == 1) {
            return Integer.parseInt(n);
        } else {
            int sum = 0;

            for (int i = 0; i < n.length(); i++) {
                char num = n.charAt(i);

                sum += Integer.parseInt(Character.toString(num));
            }

            String sumString = Integer.toString(sum);

            return superDigit(sumString, sumString.length());
        }

    }

    /*
        public static int superDigit(String n, int k) {
        if(n.length()==1 && k==1){
            return Integer.parseInt(n);
        } else {
            long result=0;
            for(int i=0; i<n.length(); i++){
                result+=Character.getNumericValue(n.charAt(i));
            }
            result*=k;
            return superDigit(result+"", 1);
        }
    }

        researched solution
     */

}
