package com.logicmojo.java.dsa.arrays.twopointers;

import java.util.Arrays;

public class SquaringSortedArray {
    public static void main(String[] args) {
        int arr[] = {-4,-3,-2,1,4,8};

        System.out.println("Bruteforce");
        findSquareOfSortedArrayBruteForce(arr);
        System.out.println("Optimised Two pointer");
        findSquareOfSortedArrayOptimised(arr);
    }

    private static void findSquareOfSortedArrayOptimised(int[] arr) {
        int i=0,j=arr.length-1,k=arr.length-1;
        int[] output = new int[arr.length];
        while(i<=j){
            if(Math.abs(arr[i]) < Math.abs(arr[j])){
                output[k--] = arr[j] * arr[j];
                j--;
            }
            else{
                output[k--] = arr[i] * arr[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(output));

    }

    private static void findSquareOfSortedArrayBruteForce(int[] arr) {
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            output[i]= arr[i] * arr[i];
        }
        Arrays.sort(output);
        System.out.println(Arrays.toString(output));
    }
}
