package com.logicmojo.java.dsa.arrays.twopointers;

import java.util.Arrays;

public class TwoSum2Pointer {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,6,9,10};
        int target = 15;

        System.out.println("BruteForce output");
        System.out.println(Arrays.toString(findTwoSumBruteForce(arr, target)));
        System.out.println("Optimised output");
        System.out.println(Arrays.toString(findTwoSumOptimisedTwoPointer(arr, target)));
    }

    private static int[] findTwoSumOptimisedTwoPointer(int[] arr, int target) {
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] ==target){
                return new int[]{i,j};
            }
            else if(arr[i]+ arr[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }

    private static int[] findTwoSumBruteForce(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }
}
