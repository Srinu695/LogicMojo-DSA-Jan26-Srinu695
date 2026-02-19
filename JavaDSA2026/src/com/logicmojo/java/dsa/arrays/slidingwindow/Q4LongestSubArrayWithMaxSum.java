package com.logicmojo.java.dsa.arrays.slidingwindow;

public class Q4LongestSubArrayWithMaxSum {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,0};
        int arr[] = {4,1,-1,1,-2,3};
        int k = 5; //max sum
        System.out.println("===============BruteForce===============");
        System.out.println(findLongestSubArrayWithMaxSum(arr, k));

        System.out.println("===============Sliding Window===============");
        System.out.println(findLongestSubArrayWithMaxSumOptimised(arr, k));
    }

    private static int findLongestSubArrayWithMaxSumOptimised(int[] arr, int k) {
        int i=0,j=0, currentWindowSum=0,maxLength=0;
        while(j<arr.length){
            currentWindowSum+= arr[j];

            if(currentWindowSum> k){
                currentWindowSum -= arr[i];
                i++;
            }
            maxLength = Math.max(maxLength, j-i+1);
            j++;
        }
        return maxLength;
    }

    private static int findLongestSubArrayWithMaxSum(int[] arr, int k) {
        int maxWindowSize = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentWindowSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentWindowSum += arr[j];

                if (currentWindowSum > k) {
                    break;
                } else {
                    maxWindowSize = Math.max(maxWindowSize, j - i + 1);
                }

            }
        }
        return maxWindowSize;
    }
}
