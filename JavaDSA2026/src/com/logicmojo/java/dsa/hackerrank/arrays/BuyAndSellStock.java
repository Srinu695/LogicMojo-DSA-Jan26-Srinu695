package com.logicmojo.java.dsa.hackerrank.arrays;

public class BuyAndSellStock {

    public static void main(String[] args) {
        //int arr[] = {100,120,130,140,150,100};
        int arr[] = {0,1,0,1,0,1};
        System.out.println(findMaxProfitBruteForce(arr));
    }

    private static int findMaxProfitBruteForce(int[] arr) {
        int profitSum = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] > arr[i]){
                int profit = arr[i+1] - arr[i];
                profitSum = profitSum + profit;
            }
        }
        return profitSum;
    }


}
