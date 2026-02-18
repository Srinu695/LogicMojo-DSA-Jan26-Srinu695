package com.logicmojo.java.dsa.arrays.slidingwindow;

public class Q1SumOfSubArraysSizeK {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,0};
        int k = 2; //Window Size

        System.out.println("=============BruteForce Approach==============");
        findSumOfSubArraysBruteForce(arr, k);

        System.out.println("\n=============Sliding Window==============");
        findSumOfSubArraysSlidingWindowOptimised(arr, k);
    }

    private static void findSumOfSubArraysSlidingWindowOptimised(int[] arr, int k) {
        int i=0,j=0;
        int currentWindowSum = 0;
        while(j<arr.length){
            currentWindowSum += arr[j];

            if(j-i+1==k){
                System.out.print(currentWindowSum+ " ");
                currentWindowSum -= arr[i];
                i++;
            }
            j++;
        }

    }

    private static void findSumOfSubArraysBruteForce(int[] arr, int k) {
        for(int i=0;i<=arr.length-k;i++){
            int currentWindowSum = 0;
            for(int j=i;j<i+k;j++){
                currentWindowSum += arr[j];
            }
            System.out.print(currentWindowSum+ " ");
        }
    }
}
