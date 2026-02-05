package com.logicmojo.java.dsa.binary.search;

/**
 * Find occurrence of target in given sorted array
 * But we need to provide or return the first index of target.
 *
 */
public class FindFirstIndexOfTargetInAnArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,5,5,6,6,8,8,9};
        int target = 5;
        System.out.println(findFirstIndexOfTarget(arr, target));
    }

    private static int findFirstIndexOfTarget(int[] arr, int target) {
        int i=0, j = arr.length-1;
        int ans = -1;

        while(i<=j){
            int mid=i+ (j-i)/2;
            if(arr[mid] <target){
                i = mid+1;
            }
            else if(arr[mid] == target){
                ans = mid;
                j=mid-1;
            }
            else{
                j=mid-1;
            }

        }
        return ans;
    }
}
