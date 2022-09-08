package com.company.Algorithms;

public class HalloweenSale {
    public static int howManyGames(int strtPrice, int discount, int minPrice, int budget) {
        int gamesCanBuy = 0;
        // Return the number of games you can buy
        // price of first game - budget games++
        // price - discount < budget games++
        // price >= minPrice

        int price = strtPrice;
        if (budget >= strtPrice) {

            while(budget >= minPrice && budget >= price) {

                if(price <= budget) {
                    gamesCanBuy++;
                    budget -= price;
                    price -= discount;
                }

                if(price <= minPrice) {
                    price = minPrice;
                }

                System.out.println(gamesCanBuy);


            }
        }



        return gamesCanBuy;

    }

}
