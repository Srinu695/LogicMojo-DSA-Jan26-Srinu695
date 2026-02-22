package com.logicmojo.java.dsa.hackerrank.arrays;

public class SingleElementInSorted {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,6,7,7,8,8,9,9};
        System.out.println(findSingleElementInSortedArrayBruteForce(arr));

        System.out.println(findSingleElementInSortedArrayOptimised(arr));
    }

    private static int findSingleElementInSortedArrayOptimised(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            int mid = i+(j-i)/2;
            if(mid%2==1)
                mid--;

            if(arr[mid] == arr[mid+1]){
                i=mid+2;
            }
            else{
                j=mid;
            }

        }
        return arr[i];
    }

    private static int findSingleElementInSortedArrayBruteForce(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(i==arr.length-1){ // To handle if last element is single element
               return arr[i];
            }
            if(arr[i]==arr[i+1]){
                //Duplicate present Comparing i,i+1 elements if duplicate present  as they are side by side
                // as array is sorted
                i= i+2; // Skipping pair we have find out so far, so incrementing by 2.
            }
            else{
                return arr[i];  //Duplicate not present
            }
        }
        return -1; // If there is not single element
    }
}
