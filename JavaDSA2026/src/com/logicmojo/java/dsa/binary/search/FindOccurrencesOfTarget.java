package com.logicmojo.java.dsa.binary.search;

/**
 * This gives output like for target element frequncy in given array
 */
public class FindOccurrencesOfTarget {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,6,9};
        int target =6;
        int firstOccurrence = findFirstOccurrenceOfTarget(arr,target);
        int lastOccurrence = findLastOccurrenceOfTarget(arr,target);
        System.out.println("First Occurrence of target:" + firstOccurrence);
        System.out.println("Last Occurrence of target:" + lastOccurrence);
        int frequency = lastOccurrence-firstOccurrence+1;
        System.out.println("Occurences of target: " + frequency);

    }

    private static int findLastOccurrenceOfTarget(int[] arr, int target) {
        int i=0,j=arr.length-1, ans = -1;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(arr[mid] < target){

                i  = mid+1;
            }
            else if(arr[mid] == target){
                ans = mid;
                i = mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }

    private static int findFirstOccurrenceOfTarget(int[] arr, int target) {
        int i = 0, j = arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]>target){
                j = mid-1;
            }
            else if(arr[mid] == target){
                ans = mid;
                j=mid-1;

            }
            else{
                i= mid+1;
            }

        }
        return ans;
    }
}
