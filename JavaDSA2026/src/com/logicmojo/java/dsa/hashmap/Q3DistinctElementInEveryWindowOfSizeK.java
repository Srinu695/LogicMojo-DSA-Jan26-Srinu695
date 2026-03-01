package com.logicmojo.java.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q3DistinctElementInEveryWindowOfSizeK {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 4, 3, 4};
        int k = 4;
        findDistinctElementsIWindowK(arr, k);

    }

    private static void findDistinctElementsIWindowK(int[] arr, int k) {
        int i = 0, j = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        while (j < arr.length) {
            int endWindow = arr[j];
            hashMap.put(endWindow, hashMap.getOrDefault(endWindow, 0) + 1);

            if (j - i + 1 == k) {
                System.out.print(hashMap.size() + " ");
                int startWindow = arr[i];
                int count = hashMap.get(startWindow) - 1;
                if (count >= 1) {
                    hashMap.put(startWindow, count);
                } else {
                    hashMap.remove(startWindow);
                }
                i++;
            }
            j++;
        }

    }
}
