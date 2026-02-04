package com.logicmojo.java.dsa.binary.search;

/**
 *  This program searches for an element in the given array,
 *  if element present it gives index of the element
 *  if element is not present it returns the index, where it should exist in array (Ceil)
 *  (which means next greater number index)
 *  Input array : Should be in ascending order
 */
public class CeilForAscendingSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,15,21};
        int target = 17;
        System.out.println(searchForTargetInArray(arr, target));
    }

    private static int searchForTargetInArray(int[] arr, int target) {
        int i=0,j=arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid] >= target){
                ans = mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }

        return ans == -1 ? arr.length : ans;

    }


}
