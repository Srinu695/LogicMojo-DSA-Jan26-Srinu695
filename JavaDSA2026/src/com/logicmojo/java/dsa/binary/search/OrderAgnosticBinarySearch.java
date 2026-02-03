package com.logicmojo.java.dsa.binary.search;


/**
 * ORDER IS NOT GIVEN EITHER ASCENDING OR DESCENDING
 */
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int arr[] = {0,1,2,3,4,5,6,7,8,9,12,13};
        int arr[] = {14, 13, 12, 10, 2, 0};
        int target = 12;
        System.out.println(findIndexByOrderAgnosticApproach(arr, target));
    }

    private static int findIndexByOrderAgnosticApproach(int[] arr, int target) {
        if (arr[0] < arr[arr.length - 1]) {     // THIS IS TO FIND OUT SORTING ORDER IS ASCENDING OR DESCENDING
            return findByNormalBinarySearch(arr, target);
        } else {
            return findByReverseBinarySearch(arr, target);
        }
    }

    private static int findByReverseBinarySearch(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    private static int findByNormalBinarySearch(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
