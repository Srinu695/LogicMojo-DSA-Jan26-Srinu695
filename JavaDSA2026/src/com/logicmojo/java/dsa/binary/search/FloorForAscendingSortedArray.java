package com.logicmojo.java.dsa.binary.search;

/**
 *  This program searches for target in given array.
 *  If element is present , it returns same element as the output
 *  If element is not present , it returns floor of that element in array
 *  which means nearest small number [Floor] to the target in the array
 *  Input Array: Sorted Ascending order.
 */
public class FloorForAscendingSortedArray {
    public static void main(String[] args) {
        int arr[] ={3,6,8,10,11,13};
        int target = 9;
        System.out.println(findFloorForTargetElement(arr, target));
    }

    private static int findFloorForTargetElement(int[] arr, int target) {
        int i=0,j=arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid] <= target) {
                ans = mid;
                i = mid+1;
            }
            else{
                j= mid-1;
            }

        }
        return arr[ans];
    }
}
