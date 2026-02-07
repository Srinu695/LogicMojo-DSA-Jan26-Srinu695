package com.logicmojo.java.dsa.binary.search;

/**
 * This is to find number of times array is rotated in right side i.e right rotation
 * Here when we see intutivily the index of smaller element in array gives you the number of times
 * array is rotated. So this boils down to find smallest element in  array.
 * We are doing the same here
 * Finally it returns the index of smallest number in array
 */
public class NumberOfTimesArrayIsRotated {

    public static void main(String[] args) {
        int arr[] = {4,5,6,6,6,7,1,2,3};            //1 is smaller number here, 6 is answer.output
        System.out.println(findNumberOfTimesGivenArrayIsRotatedRight(arr));
    }

    private static int findNumberOfTimesGivenArrayIsRotatedRight(int arr[]) {
        int i=0,j=arr.length-1;
        while(i<j){         //i<j , for single element array
            // we can directly return 0 , as roration doesnt effect array Eg: [1]
            int mid = i+(j-i)/2;
            if(arr[mid] < arr[j]){
                // mid index value less than j index value means left is sorted,
                //we should move towards unsorted side to get minimum element
                //j=mid as mid also can be minimum element in array, So we are not discarding mid
                j=mid;
            }
            else if(arr[mid] > arr[j]){
                i = mid+1;
                //If mid > j index, left is unsorted, so we move towards left side , si i= mid+1
                // we are discaring mid here, as [j] value is lower than mid, mid cant be
                // minimum element in array
            }
            else{ j --;
                //Else shrinking the array when mid and j value are equal
            }
        }
        return i; // i always points to minimum index in this logic.

    }
}
