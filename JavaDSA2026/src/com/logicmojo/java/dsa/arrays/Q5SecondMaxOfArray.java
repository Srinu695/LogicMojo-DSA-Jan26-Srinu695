package com.logicmojo.java.dsa.arrays;

import java.util.Arrays;

public class Q5SecondMaxOfArray {

    public static void main(String[] args) {
        int arr[]= {1,4,4,3,2,1};
        findSecondMaxOfArray(arr);
    }

    private static void findSecondMaxOfArray(int[] arr) {
        int max= Integer.MIN_VALUE;
        int secondMax = max;
        for(int i=0;i< arr.length; i++){

            if(arr[i]> max){
                secondMax = max; //Need to capture last max
                max = arr[i];
            }
            else if(arr[i]> secondMax && arr[i] != max){
                secondMax  = arr[i];
            }

        }
        System.out.println("Input Array:" + Arrays.toString(arr));
        System.out.println("Max:"+ max);
        System.out.println("SecondMax:"+ secondMax);
    }
}
