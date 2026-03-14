package com.logicmojo.java.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int search = 20;
        int arr[] = {2, 4, 6, 8, 9, 10, 20};
        System.out.println("===============Iterative Binary Search============");
        System.out.println(findIterativeBinarySearch(arr, search));

        System.out.println("===============Recursive Binary Search============");
        System.out.println(findRecursiveBinarySearch(arr, search, 0, arr.length - 1));


    }

    private static int findRecursiveBinarySearch(int[] arr, int search, int i, int j) {
        if (i > j) {
            return -1;
        }
        int mid = i + (j - i) / 2;
        if (search > arr[mid]) {
            return findRecursiveBinarySearch(arr, search, mid + 1, j);
        } else if (search < arr[mid]) {
            return findRecursiveBinarySearch(arr, search, i, mid - 1);
        } else {
            return mid;
        }
    }

    private static int findIterativeBinarySearch(int[] arr, int search) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (search < arr[mid]) {
                j = mid - 1;
            } else if (search > arr[mid]) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
