package com.logicmojo.java.dsa.twodimension.arrays;

import java.util.Arrays;

/**
 * Finds the transport of given matrix only if its is a square matrix
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int[] [] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        findTransposeOfGivenMarix(arr);
        System.out.println("Transpose of given matrix");
        System.out.println(Arrays.deepToString(arr));

    }

    private static void findTransposeOfGivenMarix(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i; j< arr[0].length;j++){ // j=i  to avoid the swapping again
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;

            }
        }
    }

}
