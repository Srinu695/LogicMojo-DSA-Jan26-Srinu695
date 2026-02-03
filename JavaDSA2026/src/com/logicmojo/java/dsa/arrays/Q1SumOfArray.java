package com.logicmojo.java.dsa.arrays;

import java.util.Arrays;

public class Q1SumOfArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 9};
        int sum = calculateSumOfArray(arr);
        System.out.println("Sum of given array: " + Arrays.toString(arr) + ": " + sum);
    }

    private static int calculateSumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
