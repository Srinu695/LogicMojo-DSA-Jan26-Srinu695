package com.logicmojo.java.dsa.exam;

import java.util.Arrays;
import java.util.List;

public class KthElementFromSortedLists {

    public static void main(String[] args) {
        List arr1 = Arrays.asList(1000);
        List arr2 = Arrays.asList(1,2,3,5,6,7,8,9,10);
        System.out.println(kthSmallest(arr1.size(), arr1, arr2.size(), arr2, 3));
    }

    public static int kthSmallest(int n, List<Integer> arr1, int m, List<Integer> arr2, int k) {
        // Ensure arr1 is the smaller array
        if (n > m) {
            return kthSmallest(m, arr2, n, arr1, k);
        }

        // Validate k
        if (k < 1 || k > n + m) {
            throw new IllegalArgumentException("k is out of bounds");
        }

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);

        while (low <= high) {
            int partA = low + (high - low) / 2;
            int partB = k - partA;

            int aLeft = (partA == 0) ? Integer.MIN_VALUE : arr1.get(partA - 1);
            int aRight = (partA == n) ? Integer.MAX_VALUE : arr1.get(partA);
            int bLeft = (partB == 0) ? Integer.MIN_VALUE : arr2.get(partB - 1);
            int bRight = (partB == m) ? Integer.MAX_VALUE : arr2.get(partB);

            if (aLeft <= bRight && bLeft <= aRight) {
                return Math.max(aLeft, bLeft);
            } else if (aLeft > bRight) {
                high = partA - 1;
            } else {
                low = partA + 1;
            }
        }

        throw new RuntimeException("Partition not found — check input arrays");
    }
}
