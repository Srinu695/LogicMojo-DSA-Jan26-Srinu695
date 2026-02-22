package com.logicmojo.java.dsa.hackerrank.arrays;

public class MaxConsecutive1sInArray {

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        System.out.println(findConsecutive1s(arr));
        System.out.println("==============Sliding Window=================");
        System.out.println(findConsecutive1sSlidingWindow(arr));
    }

    private static int findConsecutive1sSlidingWindow(int[] arr) {
        int maxCount=0,j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j=i+1;
            }
            maxCount = Math.max(maxCount, i-j+1);
        }
        return maxCount;
    }

    private static int findConsecutive1s(int[] arr) {
        int count=0, maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
            else if(arr[i]==0){
                maxCount = Math.max(count, maxCount);
                count=0;
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}
