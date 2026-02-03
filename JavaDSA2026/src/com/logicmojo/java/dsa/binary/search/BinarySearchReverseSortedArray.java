package com.logicmojo.java.dsa.binary.search;

public class BinarySearchReverseSortedArray {
    public static void main(String[] args) {
        int arr[] = {9, 7, 6, 5, 3, 2, 1};
        int target = 2;

        System.out.println(findElementIndexForReverseSortedArray(arr, target));
    }

    private static int findElementIndexForReverseSortedArray(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - 1) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}
