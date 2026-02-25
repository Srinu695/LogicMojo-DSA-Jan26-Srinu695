package com.logicmojo.java.dsa.exam;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,4,6,8,9,10};
        int arr2[] = {0,2,4,7,9,10};

        System.out.println(findMedianOfTwoSortedArrays(arr1, arr2));
    }

    private static double findMedianOfTwoSortedArrays(int[] arr1, int[] arr2) {
        if(arr1.length> arr2.length){
            return findMedianOfTwoSortedArrays(arr2,arr1);
        }

        int m = arr1.length;
        int n= arr2.length;

        int low = 0, high = m;
        while(low <=high){
            int partA = (low+high)/2;
            int partB = (m+n+1)/2-partA;

            int leftPartA =  partA ==0 ? Integer.MIN_VALUE : arr1[partA-1];
            int rightPartA = partA ==m ? Integer.MAX_VALUE : arr1[partA];

            int leftPartB = partB ==0 ? Integer.MIN_VALUE : arr2[partB-1];
            int rightPartB = partB ==n ? Integer.MAX_VALUE : arr2[partB];

            if(leftPartA <= rightPartB && leftPartB <= rightPartA){
                if((m+n)%2 == 0){
                    return (Math.max(leftPartA, leftPartB) + Math.min(rightPartA, rightPartB))/2.0;
                }
                else{
                    return Math.max(leftPartA, leftPartB);
                }

            }else if(leftPartA > rightPartB){
                high = partA -1;
            }
            else{
                low = partA + 1;
            }
        }

        return 0;
    }
}
