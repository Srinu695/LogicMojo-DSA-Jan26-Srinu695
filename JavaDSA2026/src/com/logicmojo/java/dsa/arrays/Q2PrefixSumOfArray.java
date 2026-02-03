package com.logicmojo.java.dsa.arrays;

import java.util.Arrays;

public class Q2PrefixSumOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        calculatePrefixSum(arr);

        calculatePrefixSumOptimised(arr);


    }

    private static void calculatePrefixSumOptimised(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // ith index element + i-1 index element
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println("Final Optimised prefixSum :" + Arrays.toString(arr));

    }

    private static void calculatePrefixSum(int[] arr) {
        int prefixSum[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefixSum[i] = sum;
        }
        System.out.println("Input Array:" + Arrays.toString(arr));
        System.out.println("PrefixSum in new Array:" + Arrays.toString(prefixSum));
    }
}
