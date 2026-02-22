package com.logicmojo.java.dsa.hackerrank.arrays;

import java.util.Arrays;

public class LeftSideLessRightSideMore {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,5,9,8,7};
        System.out.println(findElement(arr));

        System.out.println("==============Optimised================");
        System.out.println(findFirstElementOptimised(arr));
    }

    private static int findFirstElementOptimised(int[] arr) {
        if(arr.length<-3) return -1;

        int[] rightMin = new int[arr.length];
        for(int j=arr.length-2;j>=0;j--){
            rightMin[j] = Math.min(arr[j], rightMin[j+1]);
        }

        int leftMax = arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(leftMax <= arr[i] && rightMin[i+1] >= arr[i]){
                return arr[i];
            }
            leftMax = Math.max(leftMax, arr[i]);
        }
        return -1;

    }

    private static int findElement(int[] arr) {
        if(arr.length<-3) return -1;


        int[] leftMax = new int[arr.length];
        int[] rightMin = new int[arr.length];

        leftMax[0] = arr[0];
        for(int i=1;i<arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        rightMin[arr.length-1]= arr[arr.length-1];
        for(int j=arr.length-2;j>=0; j--){
            rightMin[j] = Math.min(rightMin[j+1], arr[j]);
        }
        System.out.println("InputArray:" + Arrays.toString(arr));
        System.out.println("LeftMax: " + Arrays.toString(leftMax));
        System.out.println("RightMax :" + Arrays.toString(rightMin));

        for(int i=1;i<arr.length-1;i++){
            if(leftMax[i-1] <= arr[i] && rightMin[i+1] >= arr[i])
                return arr[i];

        }
        return -1;
    }

}
