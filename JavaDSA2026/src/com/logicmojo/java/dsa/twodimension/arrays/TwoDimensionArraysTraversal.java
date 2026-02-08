package com.logicmojo.java.dsa.twodimension.arrays;

/**
 * Traversals for an 2D Array
 * Keep the index in [i]j] which is constant as part of outer loop.
 */
public class TwoDimensionArraysTraversal {

    public static void main(String[] args) {
        int arr[][] =   {{1,2,3},
                        {4,5,6},
                        {7,8,9}};


        print2dArrayRowWise(arr);
        print2dArrayColumnWise(arr);
        System.out.println("\n==============================");

        print2dArrayReverseRowWise(arr);
        print2dArrayReverseColumnWise(arr);

    }

    private static void print2dArrayReverseColumnWise(int[][] arr) {
        System.out.println("\nPrinting array in reverse column wise");
        for(int j=arr[0].length-1; j>=0;j--){
            for(int i= arr.length-1;i>=0;i--){
                System.out.print(arr[i][j] + " ");
            }

        }
    }

    private static void print2dArrayReverseRowWise(int[][] arr) {
        System.out.println("\nPrinting array in reverse row wise");
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    private static void print2dArrayColumnWise(int[][] arr) {
        System.out.println("\nPrinting column wise");
        for( int j=0; j< arr[0].length; j++){
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    private static void print2dArrayRowWise(int[][] arr) {
        System.out.println("Printing row wise");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
