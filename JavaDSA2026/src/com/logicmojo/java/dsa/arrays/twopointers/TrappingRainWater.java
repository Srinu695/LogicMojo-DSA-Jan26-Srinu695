package com.logicmojo.java.dsa.arrays.twopointers;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        //int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int arr[] = {1,10,0};
        int arr[] = {4,2,0,3,2,5};
        System.out.println("=============With space===============");
        System.out.println(findMaxTrappingRainWaterWithSpace(arr));
        System.out.println("=================Two pointer===============");
        System.out.println(findMaxTrappingRainWaterWithoutSpace(arr));
    }

    private static int findMaxTrappingRainWaterWithoutSpace(int[] arr) {
        int lmax = 0;
        int rmax= 0, trappingWater=0;
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l] < arr[r]){
                lmax= Math.max(lmax,arr[l]);
                trappingWater += lmax-arr[l];
                l++;
            }
            else{
                rmax = Math.max(rmax, arr[r]);
                trappingWater += rmax- arr[r];
                r--;
            }
        }
        return  trappingWater;
    }

    private static int findMaxTrappingRainWaterWithSpace(int[] arr) {
        int lmax[] = new int[arr.length];
        int rmax[] =  new int[arr.length];

        lmax[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i]= Math.max(lmax[i-1], arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(lmax));
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        System.out.println(Arrays.toString(rmax));

        int trappingWater =0;
        for(int i=0;i<arr.length;i++){
            trappingWater += (Math.min(lmax[i], rmax[i]))-arr[i];
        }
        return trappingWater;
    }


}
