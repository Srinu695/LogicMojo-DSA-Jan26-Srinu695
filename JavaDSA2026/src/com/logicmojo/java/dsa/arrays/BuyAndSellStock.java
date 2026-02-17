package com.logicmojo.java.dsa.arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        //int arr[] = {7,6,4,3,1};
        System.out.println("===================BruteForce approach==============");
        System.out.println(findMaxProfitBySellingStockBruteForce(arr));

        System.out.println("===================Optimised approach==============");
        System.out.println(findMaxProfitBySellingStockOptimised(arr));
    }

    private static int findMaxProfitBySellingStockOptimised(int[] arr) {
        int minSofar = arr[0] , maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            minSofar = Math.min(minSofar, arr[i]);
            int profit = arr[i]-minSofar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    private static int findMaxProfitBySellingStockBruteForce(int[] arr) {
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
