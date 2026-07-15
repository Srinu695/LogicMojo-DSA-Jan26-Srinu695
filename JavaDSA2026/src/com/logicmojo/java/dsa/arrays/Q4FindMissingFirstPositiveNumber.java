package com.logicmojo.java.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

//JAN 18 2026 Problem 4 1:43:05 - 2:24:06
public class Q4FindMissingFirstPositiveNumber {

    public static void main(String[] args) {
        //int arr[] = {-3,-4,1,2,0,3,5,6};
        int arr[] = {1,2,3,4};
        //Time Complexity O(n^2)
        int missingPositiveNumber = findMissingPositiveNumberBruteForce(arr);

        //Time Complexity O(n) ,Space Complexity O(n)
        int missingPositiveNumHashSet = findMissingNumberUsingHashSet(arr);

        //Time complexity o(n) Space complexity o(1)
        int missingPositiveNumByMarking = findMissingPositiveNumberByMarking(arr);
        System.out.println(missingPositiveNumber);
        System.out.println(missingPositiveNumHashSet);

        System.out.println(missingPositiveNumByMarking);
    }

    private static int findMissingPositiveNumberByMarking(int[] arr) {

        //Updating negative values and numbers larger than arr.length to arr.length+1
        //as they dont have any impact in answer
        //Answer always lies in range [1,arr.length]
        for(int i=0; i< arr.length; i++){
            if(arr[i] <=0 || arr[i] > arr.length){
                arr[i] = arr.length+1;
            }
        }

        //Marking the node/value  with -value to know its visited or that number is already present
        for(int i=0; i <arr.length ; i++){
            int x = Math.abs(arr[i]);

            if(x<=arr.length){
                int index = x-1;
                arr[index] = -arr[index];
            }
        }

        //After marking the node iterating in array to find out positive value which indicates
        //that number is missing
        //Num mapped with index
        //Number --> Index
        //1     --> 0
        //2     --> 1
        for(int i=0 ;i< arr.length;i++){
            if(arr[i] >0){
                return i+1;
            }
        }

        //To handle edge case {1,2,3} returning arr.length+1
        return arr.length+1;

    }

    private static int findMissingNumberUsingHashSet(int[] arr) {

        Set<Integer> inputSet = new HashSet<>();

        for(int x: arr){
            inputSet.add(x);
        }

        for(int i = 1; i<arr.length ; i++){

            if(!inputSet.contains(i)){
                return i;
            }
        }
        return arr.length+1;

    }

    private static int findMissingPositiveNumberBruteForce(int[] arr) {
        for(int i=1; i< arr.length; i++){
            boolean found = false;

            for(int x: arr){
                if(i == x){
                    found = true;
                    break;
                }
            }
            if(found == false){
                return i;
            }
        }
        return arr.length +1;
    }
}
