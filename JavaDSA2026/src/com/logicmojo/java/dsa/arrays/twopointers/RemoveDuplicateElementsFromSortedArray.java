package com.logicmojo.java.dsa.arrays.twopointers;

//Lecture Jan 24 2026 58:38 - 1:41:20
public class RemoveDuplicateElementsFromSortedArray {

    public static void main(String[] args) {

        int duplicatesArray[] = {1,3,3,5,6,6,8,9,9,10};

        int length = removeDuplicatesUsingTwoPointer(duplicatesArray);
        System.out.println(length);
        //printing final array
        //System.out.println(Arrays.toString(duplicatesArray));
        for(int i=0;i< length;i++){
            System.out.print(duplicatesArray[i] + " ");
        }

    }

    private static int removeDuplicatesUsingTwoPointer(int[] duplicatesArray) {

        int i=0;

        //i points to unique element from left
        //j is for traversal

        for(int j=1; j< duplicatesArray.length ; j++){
            if(duplicatesArray[i] != duplicatesArray[j]){
                duplicatesArray[++i]= duplicatesArray[j];
            }
        }
        //i is index, we need to return length of array so returning i+1
        return i+1;
    }
}
