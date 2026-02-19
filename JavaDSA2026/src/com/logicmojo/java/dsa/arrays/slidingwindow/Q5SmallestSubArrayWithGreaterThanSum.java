package com.logicmojo.java.dsa.arrays.slidingwindow;

public class Q5SmallestSubArrayWithGreaterThanSum {
    public static void main(String[] args) {
        //int arr[] = {1,1,1,1,1,8};
        int arr[] = {1,4,4};
        int k=4;
        System.out.println(findSmallestSubArrayLengthBruteForce(arr, k));

        System.out.println(findSmallestSubArrayLengthOptimised(arr, k));
    }

    private static int findSmallestSubArrayLengthOptimised(int[] arr, int k) {
        int i=0,j=0, currentWindowSum=0, minLength = Integer.MAX_VALUE;
        while(j<arr.length){
            currentWindowSum += arr[j];

            while(currentWindowSum >=k){
                minLength = Math.min(minLength, j-i+1);
                currentWindowSum -= arr[i];
                i++;
            }
            j++;

        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    private static int findSmallestSubArrayLengthBruteForce(int[] arr, int k) {
        int subArrayMinLength = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentWindowSum = 0;
            for(int j=i;j<arr.length;j++){
                currentWindowSum+= arr[j];
                if(currentWindowSum >= k){
                    subArrayMinLength = Math.min(subArrayMinLength, j-i+1);
                }
            }
        }
        return subArrayMinLength == Integer.MAX_VALUE ? 0 : subArrayMinLength;
    }
}
