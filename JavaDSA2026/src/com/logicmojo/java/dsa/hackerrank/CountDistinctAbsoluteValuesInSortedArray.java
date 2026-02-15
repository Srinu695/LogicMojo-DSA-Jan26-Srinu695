package com.logicmojo.java.dsa.hackerrank;

import java.util.HashSet;

public class CountDistinctAbsoluteValuesInSortedArray {
    public static void main(String[] args) {

        //int arr[] = {-3,-2,1,2,8};
        //int arr[] = {-8,-7,-3,-2,1,2,5,7,8};
        int arr[] = {-2,-2,-1,-1,0,0,2,4,5,7};

        System.out.println("Bruteforce Approach");
        System.out.println(findDistinctAbsValues(arr));

        System.out.println("Optimised Approach");
        System.out.println(findDistinctAbsValuesOptimisedApproach(arr));



    }

    private static int findDistinctAbsValuesOptimisedApproach(int[] arr) {
        int i = 0, j = arr.length - 1, count = 0;
        while (i <= j) {

            while(i<j && arr[i] == arr[i+1]){
                i++;
            }
            while(j>i && arr[j] == arr[j-1]){
                j--;
            }



            if (Math.abs(arr[i]) == Math.abs(arr[j])) {
                i++;
                j--;
                count++;
            } else if(Math.abs(arr[i]) > Math.abs(arr[j])){
                i++;
                count++;
            }
            else{
                j--;
                count++;
            }

        }
        return count;
    }

    private static int findDistinctAbsValues(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int abs = Math.abs(arr[i]);
            hashSet.add(abs);
        }
        return hashSet.size();
    }
}
