package com.logicmojo.java.dsa.hackerrank;

/**
 * Remove duplicates from sorted ascending array
 * Input : Sorted Ascending ARRAY
 * OUTPUT : Length of array after removing the duplicates
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,7,7,7,7,7,7,8,8};

        System.out.println("============BruteForce==============");
        System.out.println(removeDuplicatesBruteForce(arr));

        System.out.println("===============Optimised two pointer approach=============");
        System.out.println(removeDuplicatesOptimisedTwoPointer(arr));
    }

    private static int removeDuplicatesOptimisedTwoPointer(int[] arr) {
        int i=0; // i points to unique element
        for(int j=1;j<arr.length; j++){ //j for traversal
            if(arr[i] !=arr[j]){
                i++;                    //i points to unique element , next element is dulicate, so incrementing and assigning new value
                arr[i] = arr[j];
            }

        }
        for(int s=0;s<=i; s++)
            System.out.print(arr[s]+ " "); //printing elements
        System.out.println();
        return i+1;             //as i is index, to get length adding +1;
    }


    private static int removeDuplicatesBruteForce(int[] arr) {
        int n = arr.length;
        int newLength = n;
        for(int i=0;i< newLength;i++){
            for(int j=i+1;j< newLength  ;j++){
                if(arr[i] == arr[j]){
                    for(int k=j;k< newLength-1;k++){
                        arr[k] = arr[k+1];  //shiting elements
                    }
                    newLength--;j--;        // after shifting decrementing length to avoid index out of bound,
                    // decrementing j to check new j is again duplicate

                }
            }
        }
        for(int s=0;s<newLength; s++)
            System.out.print(arr[s]+ " ");      //printing elements
        System.out.println();
        return newLength;                   //returning new length of array
    }
}
