package com.logicmojo.java.dsa.binary.search;

public class CeilForDescendingSortedArray {
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,2};
        int target = 2;
        System.out.println(searchForElementInArray(arr, target));
    }

    private static int searchForElementInArray(int[] arr, int target) {
        int i = 0, j = arr.length - 1, ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] <= target) {
                j = mid - 1;
            } else {
                ans = mid;
                i = mid + 1;
            }
        }
        return ans == -1 ? arr.length : ans;

    }
}
