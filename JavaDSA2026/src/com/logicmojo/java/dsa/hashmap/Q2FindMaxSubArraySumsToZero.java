package com.logicmojo.java.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *  Find Maximum sub array length, who sum equals zero
 */
public class Q2FindMaxSubArraySumsToZero {

    public static void main(String[] args) {
        int arr[] = {-1,3,2,-2,-3,3,-2};

        //int arr[] = {-1,1,2,-2};

        System.out.println(MaxSubArraySumsZero(arr));

    }

    private static int MaxSubArraySumsZero(int[] arr) {
        int currentSum=0;
        int maxLength = 0;
        Map<Integer , Integer> hashMap = new HashMap<>();
        int j=0;
        hashMap.put(0,-1); // To handle edge case scenario like [3,-3] [2,-2,3,-3]
        while(j<arr.length){
            currentSum += arr[j];
            if(hashMap.containsKey(currentSum)){
                maxLength = Math.max(maxLength, j-hashMap.get(currentSum));
            }
            else{
                //A     B       C
                //AB = 5, AC =5  ==> BC = 0
                hashMap.put(currentSum, j);
            }

            j++;
        }
        return maxLength;
    }
}
