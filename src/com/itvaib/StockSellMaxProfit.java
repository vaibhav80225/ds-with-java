package com.itvaib;

public class StockSellMaxProfit {
    public static int maxProfit(int a[], int start, int end){
        int buyPrice = 0;
        int totalProfit = 0;
        buyPrice = a[0];
        if (end <= start)
            return 0;
        for(int i=start ; i<end; i++){
            for(int j = i+1; j<end; j++){
                if(a[j] > a[i]){
                    System.out.println("");
                    System.out.print("buyPrice " + buyPrice);
                    System.out.print(" sell Price " + a[j]);
                    int Profit =  a[i]-buyPrice + maxProfit(a, start, i-1) + maxProfit(a, j+1, end);
                    System.out.print(" total profit: "+ totalProfit);
                    // Update the maximum profit so far
                    totalProfit = Math.max(totalProfit, Profit);
                }
            }}

        return totalProfit;

    }
    public static void main(String ar[]){
        int priceByday [] = new int [] {100, 180, 260, 310, 40, 535, 695};
        System.out.println(" final Profit" +maxProfit(priceByday, 0, priceByday.length));

    }
}
