package com.logicmojo.java.dsa.binary.search;

/**
 * This program gives last index of target element if duplicates are present in given array
 * Input: Array is sorted in ascending order
 */
public class FindLastIndexOfTargetInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,7,7,8,9,9,10};
        int target =7;

        //int arr[] = {1,3,4,5,6,7,8,9,9,10};
        //int target =9;
        System.out.println(findLastIndexOfTarget(arr, target));
    }

    private static int findLastIndexOfTarget(int[] arr, int target) {
        int i=0, j=arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(arr[mid] < target){
                i= mid+1;

            }
            else if(arr[mid]== target){
                ans = mid;
                i = mid+1;
            }
            else{
                j = mid-1;
            }

        }
        return ans;
    }
}
