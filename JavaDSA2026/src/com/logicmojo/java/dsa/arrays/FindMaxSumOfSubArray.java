package com.logicmojo.java.dsa.arrays;

import java.util.Arrays;

/**
 *  This program is to return max sum of sub array and its subarray index in brute force and optimised kadanes alogorithm approach
 */
public class FindMaxSumOfSubArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,-2,-5,-1,8,4,5,6};
        //int arr[] = {3,2,-5,-7,1};
        System.out.println(findMaxSumSubArrayBruteForce(arr));

        System.out.println(Arrays.toString(findMaxSumSubArrayIndexBruteForce(arr)));

        System.out.println(findMaxSumSubArrayKadanesAlgo(arr));

        System.out.println(Arrays.toString(findSubArrayIndexWithMaxSum(arr)));
    }

    private static int[] findMaxSumSubArrayIndexBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int start =0, end=0;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum += arr[j];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }

        }
        System.out.println("===========BruteForce Index=================");
        return new int[]{start,end};
    }

    private static int[] findSubArrayIndexWithMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int start=0,end=0, tempStart=0;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
                end = i ;
                start = tempStart;
            }
            if(currentSum < 0){
                currentSum = 0;
                tempStart = i+1;
            }
        }
        System.out.println("===========Kadanes Algorithm SubArray Index============");
        return new int[] {start, end};
    }

    private static int findMaxSumSubArrayKadanesAlgo(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println("===========Kadanes Algorithm============");
        return maxSum;
    }

    private static int findMaxSumSubArrayBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum += arr[j];
                maxSum =Math.max(currentSum, maxSum);
            }

        }
        System.out.println("===========BruteForce=================");
        return maxSum;
    }
}
