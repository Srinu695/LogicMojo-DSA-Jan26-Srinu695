package com.logicmojo.java.dsa.arrays;

import java.util.Arrays;

public class Q3RangeSumQueryImmutable {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        int[] sumRange = {2, 5}; //Inclusive given indexes
        calculateRangeSum(arr, sumRange);
    }

    private static void calculateRangeSum(int[] arr, int[] sumRange) {
        System.out.println("Input array:" + Arrays.toString(arr));
        System.out.println("Index ::" + Arrays.toString(sumRange));
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println("prefix Sum:" + Arrays.toString(arr));
        int left = sumRange[0];
        int right = sumRange[1];
        int ans;
        if (left == 0)  // If left or starting index is 0 Eg: [0,3], [0,5] we can directly return arr[right] as we dont need to substract
            System.out.println(arr[right]);
        else {                                  //If  left is not 0 , we need to substract arr[left-1] from arr[right] after prefix calculation
            ans = arr[right] - arr[left-1];
            System.out.println("RangeSum:" + ans);
        }


    }
}
