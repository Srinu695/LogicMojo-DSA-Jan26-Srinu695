package com.logicmojo.java.dsa.hackerrank.arrays;

import java.util.Arrays;

/**
 *  This gives index of two elements which sums up to given target element
 *  Index starts from zero
 */
public class TwoSum {

    public static void main(String[] args) {
        int arr[] = {0,1,2,5,6,10};
        int target = 16;

        System.out.println(Arrays.toString(findIndexesWhereSumIsTarget(arr, target)));
    }

    private static int[] findIndexesWhereSumIsTarget(int[] arr, int target) {
        int length = arr.length;
        for(int i=0;i<length;i++){
            int complement = target - arr[i];
            int index = findComplementByBinarySearch(complement, arr);
            if(index>=0){
                return new int[]{i,index};
            }
        }
        return arr;
    }

    private static int findComplementByBinarySearch(int complement, int[] arr) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(arr[mid] == complement){
                return mid;
            }
            else if(arr[mid]> complement){
                j=mid-1;
            }
            else{
                i= mid+1;
            }
        }
        return -1;
    }
}
