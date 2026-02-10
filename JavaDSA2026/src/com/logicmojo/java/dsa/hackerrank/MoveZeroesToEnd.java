package com.logicmojo.java.dsa.hackerrank;

import java.util.Arrays;

/**
 * This is to move the zeroes to the end, maintaining the order of the elements in the array
 * Implemented brute force approach
 * Implemented optimized approach not maintaining the order that is rearranged elements
 * Implemented optimized approach maintaining the order for given input array
 */
public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int arr[] = {0, 4, 5, 3, 0};
        moveZeroesToEndBruteForce(arr);

        int[] output = moveZeroesToEndRearranged(arr);
        System.out.println("ReArranged Output array:"+ Arrays.toString(output));


        int input[] = {0,5,0,9,0,4,5,3,0,1};
        System.out.println("Input Array:" + Arrays.toString(input));
        moveZeroesToEndOptimisedWithInPlace(input);

    }

    private static void moveZeroesToEndOptimisedWithInPlace(int[] arr) {
        int j=0,i=0;        //i points to the first zero from left which needs to be swapped
                            //j is used for iteration over array
        while(j<arr.length){
            if(arr[j] !=0){                 //Throw/swap non zero elements to the front
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;
                j++;
                i++;

            }
            else{
                j++;                //If its zero element increment iterative variable j

            }
        }

        System.out.println("Optimised Inplace Output array:"+ Arrays.toString(arr));
    }

    private static int[] moveZeroesToEndRearranged(int[] arr) {
        int j = 0, i = arr.length - 1;
        //i points to the index which needs to be swapped
        //j is used for iteration over array


        while (j <= i) {
            if(arr[j] == 0){                   //Throw/swap zeroes to the end
                                                // If zero element swapping the numbers
                int temp = arr [i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
            else{
                j++;                        //Else incrementing iteration pointer variable j
            }

        }
        return arr;

    }

    private static void moveZeroesToEndBruteForce(int arr[]) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans[k++] = arr[i];
            }
        }
        System.out.println("Input Array:" + Arrays.toString(arr));
        System.out.println("BruteForce Output array:" + Arrays.toString(ans));
    }
}
