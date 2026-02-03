package com.logicmojo.java.dsa.binary.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 9, 10};
        int target = 10;
        System.out.println(findElementIndexByBinarySearch(arr, target));

    }

    private static int findElementIndexByBinarySearch(int[] arr, int target) {
        int j = arr.length - 1;
        int i = 0;
        while (i <= j) {                            // Here i<=j to handle single element in a array
            int mid = i + (j - i) / 2;               //To AVOID INT max value , it is same as i+j/2
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {         //Discard RHS as array element is bigger
                j = mid - 1;
            } else {                           //Discard LHS as array element is smaller than target
                i = mid + 1;
            }

        }
        return -1;
    }
}
