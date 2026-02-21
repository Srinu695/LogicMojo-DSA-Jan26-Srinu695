package com.logicmojo.java.dsa.arrays.twopointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        //int arr[] = {1,8,6,2,5,4,8,3,7};
        //int arr[] = {1,1};
        int arr[] = {1,3,7,9,0,5,6,7,3,2,11};
        System.out.println("BruteForce Approach");
        System.out.println(findContainerWithMostWaterBruteForce(arr));
        System.out.println("Two pointer Approach");
        System.out.println(findContainerWithMostWaterOptimisedTwoPointer(arr));
    }

    private static int findContainerWithMostWaterOptimisedTwoPointer(int[] arr) {
        int i=0,j=arr.length-1, maxArea = Integer.MIN_VALUE;
        while(i<j){
            int length = Math.min(arr[i], arr[j]);
            int breadth = j-i;
            int area = length * breadth;
            maxArea = Math.max(area, maxArea);

            if(arr[i]< arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }

    private static int findContainerWithMostWaterBruteForce(int[] arr) {
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int length = Math.min(arr[i], arr[j]);
                int breadth = j-i;
                int area = length * breadth;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
}
