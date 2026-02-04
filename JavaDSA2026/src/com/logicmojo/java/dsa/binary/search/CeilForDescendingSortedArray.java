package com.logicmojo.java.dsa.binary.search;

/**
 *  This program searches for an element in the given array,
 *  if element present it gives index of the element
 *  if element is not present, it returns its index where it should be in given array
 *  (which means next smaller number index)
 *  Input array : Should be in Descending order
 */
public class CeilForDescendingSortedArray {
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,2};
        int target = 8;
        System.out.println(searchForElementInArray(arr, target));
    }

    private static int searchForElementInArray(int[] arr, int target) {
        int i = 0, j = arr.length - 1, ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] > target) {

                i = mid + 1;
            } else {
                ans = mid;
                j = mid - 1;
            }
        }
        return ans == -1 ? arr.length : ans;

    }
}
