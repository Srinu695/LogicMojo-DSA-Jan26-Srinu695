package com.logicmojo.java.dsa.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This works for all arrays, sorted or unsorted. Two pointer works only if array is sorted.
 */
public class Q1TwoSumUnsortedArray {

    public static void main(String[] args) {
        int arr[] = {10,3,5,7,9,14};
        int target = 24;
        int ans[] =  findTwoSum(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(hashMap.containsKey(complement)){
                return new int[]{i, hashMap.get(complement)};
            }
            else{
                hashMap.put(arr[i],i);
            }

        }
        return new int[]{};
    }
}
