package com.logicmojo.java.dsa.arrays.twopointers;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int arr[] = {0,0,1,2,3,3,3,5,5,6,8,9,9};
        System.out.println("Bruteforce");
        System.out.println(removeDuplicateFromArrayBruteForce(arr));

        System.out.println("Two pointer");
        System.out.println(removeDuplicateFromArrayTwoPointer(arr));
    }

    private static int removeDuplicateFromArrayTwoPointer(int[] arr) {
        int i=0,j=1;
        while(j<arr.length){
            if(arr[j] == arr[j-1]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return i+1;
    }

    private static int removeDuplicateFromArrayBruteForce(int arr[]) {
        int[] output = new int[arr.length];
        int k=1;
        output[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                output[k++]= arr[i];
            }
        }
        System.out.println(Arrays.toString(output));
        return k;
    }
}
