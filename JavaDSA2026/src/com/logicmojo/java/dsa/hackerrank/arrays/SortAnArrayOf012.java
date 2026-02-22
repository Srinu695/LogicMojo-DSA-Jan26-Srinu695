package com.logicmojo.java.dsa.hackerrank.arrays;

import java.util.Arrays;

/**
 * Dutch National Flag Algorithm
 */
public class SortAnArrayOf012 {

    public static void main(String[] args) {
        int arr[] = {2,0,2,0,0,1,2,0,1,0,2};
        System.out.println("Input:"+Arrays.toString(arr));
        sort012Array(arr);
    }

    private static void sort012Array(int[] arr) {
        int i=0,j=0,k=arr.length-1;
        while(j<=k){

            if(arr[j] == 1){
                j++;
            }

            else if(arr[j] ==2 ){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
            }
            else{
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
               i++;j++;
            }

        }
        System.out.println("output:"+Arrays.toString(arr));
    }
}
