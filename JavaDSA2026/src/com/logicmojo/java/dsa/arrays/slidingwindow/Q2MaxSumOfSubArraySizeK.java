package com.logicmojo.java.dsa.arrays.slidingwindow;

public class Q2MaxSumOfSubArraySizeK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,0};
        int k = 4;
        System.out.println("==========BruteForce Approach=========");
        System.out.println(findMaxSumOfSubArrayBruteForce(arr,k));

        System.out.println("==========Optimised Sliding Window Approach=========");
        System.out.println(findMaxSumOfSubArrayOptimised(arr,k));
    }

    private static int findMaxSumOfSubArrayOptimised(int[] arr, int k) {
        int i=0,j=0;
        int currentWindowSum = 0 , maxSumOfSubArray = Integer.MIN_VALUE;
        while(j<arr.length){
            //Initial Work Expand window
            currentWindowSum += arr[j];

            //Window size is valid
            if(j-i+1 == k){
                maxSumOfSubArray = Math.max(currentWindowSum, maxSumOfSubArray);
                //Shrink Window
                currentWindowSum -= arr[i];
                i++; //Move Window Start ahead
            }
            j++; //Move window end ahead
        }
        return maxSumOfSubArray;
    }

    private static int findMaxSumOfSubArrayBruteForce(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<= arr.length-k;i++){
            int currentWindowSum = 0;
            for(int j=i;j<i+k;j++){
                currentWindowSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentWindowSum);
        }
        return maxSum;
    }
}
