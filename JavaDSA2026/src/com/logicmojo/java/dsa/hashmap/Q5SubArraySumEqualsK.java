package com.logicmojo.java.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q5SubArraySumEqualsK {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1};
        int k = 5;
        System.out.println(findSubArraysSumEqualsK(arr, k));
    }

    private static int findSubArraysSumEqualsK(int[] arr, int k) {
        int j=0,currentSum=0, countOfSubArrays = 0;
        Map<Integer, Integer> prefixMap =  new HashMap<>();
        prefixMap.put(0,1);
        while(j<arr.length){
            currentSum += arr[j];

            if(prefixMap.containsKey(currentSum-k)){
                countOfSubArrays += prefixMap.get(currentSum-k);
            }

                prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum,0)+1);


            j++;
        }
        System.out.println(prefixMap);
        return countOfSubArrays;
    }

}
