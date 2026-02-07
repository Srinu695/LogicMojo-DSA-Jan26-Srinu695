package com.logicmojo.java.dsa.binary.search;

/**
 * This program returns number of time array is left rotated.
 * The same logic here , we find min element index here
 * Then arr.length- min number index which is i , to get no of times array is left rotated.
 * For right rotated , we just return i , which is min element index.
 * Remaining logic remains same.
 */
public class NumberOfTimesArrayIsLeftRotated {
    public static void main(String[] args) {
        int arr[] = {3,4,1,2,2,2};
        System.out.println(findNumberOfTimesArrayIsLeftRotated(arr));

    }

    private static int findNumberOfTimesArrayIsLeftRotated(int[] arr) {
        int i=0;int j = arr.length-1;
        while(i<j){
            int mid = i+ (j-i)/2;
            if(arr[mid] < arr[j]){
                j=mid;
            }
            else if(arr[mid] > arr[j]){
                i=mid+1;
            }
            else{
                j--;
            }

        }
        return arr.length-i; //Only difference for right and left rotation of array, remaining same
    }


}
