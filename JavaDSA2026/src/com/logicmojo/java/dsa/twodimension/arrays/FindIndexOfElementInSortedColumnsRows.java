package com.logicmojo.java.dsa.twodimension.arrays;

/**
 * Staricase complexity will O(No of rows + No of columns) in worst case
 * Binary Search --> O(No of rows * log n )
 * Linear Search --> O(n^2)
 * Returns index of target in given 2d array, prints not found if element is not found.
 */
public class FindIndexOfElementInSortedColumnsRows {
    public static void main(String[] args) {
        int[] [] arr = {{1,2,3,11},
                        {4,5,6,13},
                        {7,8,9,14}};
        int target = 8;

        System.out.println("========BruteForceApproach============");
        int[] ansIndex= findIndexInBruteForceApproach(arr, target);
        printTargetIndex(ansIndex);

        System.out.println("\n========BinarySearchApproach============");
        ansIndex= findIndexInBinarySearchApproach(arr, target);
        printTargetIndex(ansIndex);

        System.out.println("\n========StairCaseApproach============");
        ansIndex= findIndexInStairApproach(arr, target);
        printTargetIndex(ansIndex);
    }

    private static int[] findIndexInStairApproach(int[][] arr, int target) {
        int i=0,j=arr[0].length-1;
        while(i< arr.length && j>=0){
            int arrayElement = arr[i][j];
            if(arrayElement == target){
                return new int[]{i,j};
            }
            else if(arrayElement < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[] {-1,-1};

    }

    private static int[] findIndexInBinarySearchApproach(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++){
            int targetIndex = findBinarySearchForEachRow(arr[i], target);
            if(targetIndex != -1){
                return new int[]{i,targetIndex};
            }
        }
        return new int[]{-1,-1};
    }

    private static int findBinarySearchForEachRow(int[] rowArray, int target) {
        int i=0,j=rowArray.length-1;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(rowArray[mid]==target){
                return mid;
            }
            else if(rowArray[mid] > target){
                j=mid-1;
            }
            else{
                i = mid+1;
            }

        }
        return -1;
    }

    private static void printTargetIndex(int[] ansIndex) {
        if(ansIndex[0] == -1){
            System.out.println("Element is not found in input");
        }
        else{
            System.out.printf("Element found at index:[%d][%d]", ansIndex[0], ansIndex[1]);
        }
    }

    private static int[] findIndexInBruteForceApproach(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
