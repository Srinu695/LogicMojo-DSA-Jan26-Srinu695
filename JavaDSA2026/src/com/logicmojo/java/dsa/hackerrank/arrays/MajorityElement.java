package com.logicmojo.java.dsa.hackerrank.arrays;

public class MajorityElement {
    public static void main(String[] args) {
        //int arr[] = {3,1,3,5,2,5,5,5,5,5};

        int arr[] = {2,2,1,1,1,1,2};
        System.out.println(findMajorityElementBruteForce(arr));

        System.out.println(findMajorityElementByMooreVoting(arr));
    }

    private static int findMajorityElementByMooreVoting(int[] arr) {
        int count=1, ansIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[ansIndex] == arr[i]){
                count++;
            }
            else{count --;}

            if(count == 0){
                ansIndex = i;
                count=1;
            }

        }
        int elementCount = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == arr[ansIndex])
                elementCount++;
        }

        if(elementCount > arr.length/2){
            return arr[ansIndex];
        }
        return -1;
    }

    private static int findMajorityElementBruteForce(int[] arr) {
        int maxLength = arr.length/2;
        for(int i=0;i<arr.length;i++){
            int numCount = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    numCount++;

                }
            }

            if(numCount > maxLength){
                return arr[i];
            }

        }
        return -1;
    }
}
