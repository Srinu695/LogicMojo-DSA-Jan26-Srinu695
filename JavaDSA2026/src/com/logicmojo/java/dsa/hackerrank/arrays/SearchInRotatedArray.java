package com.logicmojo.java.dsa.hackerrank.arrays;


import java.util.ArrayList;
import java.util.List;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int target = 1;
        int elementIndex = searchForElementInRotatedArray(arr, target);
        if(elementIndex == -1)
        System.out.println("Element not found");
        else{
            System.out.println("Index of target: " + elementIndex);
        }

    }

    private static int searchForElementInRotatedArray(int array[], int target) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (array[mid] == target) {
                //return mid;
                List<Integer> list = new ArrayList<>();
                list.get(mid);
            }
            if(array[i]<= array[mid]){          //Verify if left half is sorted
                if(target >= array[i] && target < array[mid]){ // Verify if target is in range of sorted half
                    j=mid-1;
                }
                else{
                    i = mid+1;
                }



            }
            else{
                if(target > array[mid] && target <= array[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }

            }
        }
        return -1;
    }
}
