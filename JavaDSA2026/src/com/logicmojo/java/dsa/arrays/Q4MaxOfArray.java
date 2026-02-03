package com.logicmojo.java.dsa.arrays;

import java.util.Arrays;

public class Q4MaxOfArray {
    public static void main(String[] args) {
        int arr[] = {6, 4, 5, 3, 20, 5, 45, 2, 1};
        System.out.println("Input array: " + Arrays.toString(arr));
        if (arr.length == 0) {
            System.out.println("No elements to find max");
        }
        else if (arr.length == 1)
            System.out.println("Max of given array: " + arr[0]);
        else {
            int max = findMaxOfArray(arr);
            System.out.println("Max of given array: " + max);
        }

    }

    private static int findMaxOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
