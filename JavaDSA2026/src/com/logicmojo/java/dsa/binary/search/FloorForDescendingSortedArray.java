package com.logicmojo.java.dsa.binary.search;

/**
 * This program gives floor for given number in the array if that element is not present.
 * If element is present it returns the same number
 * Input Array : Descending array
 */
public class FloorForDescendingSortedArray {

    public static void main(String[] args) {
        int arr[] = {9,7,5,4,1};
        int target = 3;
        System.out.println(findFloorInDescendingArray(arr, target));
    }

    private static int findFloorInDescendingArray(int arr[], int target) {
        int i=0,j= arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(arr[mid]> target){
                i= mid+1;
            }
            else {
                ans = mid;
                j = mid-1;
            }
        }
        return arr[ans];
    }
}
