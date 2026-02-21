package com.logicmojo.java.dsa.arrays.twopointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {1,-1,0,2,5,-7}; //Unsorted Array
        System.out.println("BruteForce Approach");
        System.out.println(findThreeSumBruteForceApproach(arr));
        System.out.println("Optimised approach");
        System.out.println(findThreeSumOptimisedApproach(arr));
    }

    private static Set<List<Integer>> findThreeSumOptimisedApproach(int[] arr) {
        int i=0,j,k;
        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(arr);
        while(i<arr.length-2){
            if (i > 0 && arr[i] == arr[i - 1]) continue; // skip duplicate i
            j=i+1;
            k=arr.length-1;
            while(j<k){

                int sum = arr[i]+ arr[j]+ arr[k];
                if(sum == 0){
                    output.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;k--;
                    while (j < k && arr[j] == arr[j - 1]) j++; // skip duplicate at j
                    while (j < k && arr[k] == arr[k + 1]) k--; //Skip duplicate at k
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return output;
    }

    private static Set<List<Integer>> findThreeSumBruteForceApproach(int[] arr) {
        Set<List<Integer>> output = new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j< arr.length-1;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+ arr[j]+ arr[k] == 0){
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet); //sorted to avoid adding duplicate values to list
                        output.add(triplet);
                    }
                }
            }
        }
        return output;
    }
}
