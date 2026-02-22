package com.logicmojo.java.dsa.hackerrank.arrays;

/**
 * Brute Force way to get missing and repeating number from given array 1 to n
 */
public class MissingAnRepeatingNumberBruteForce {

    public static void main(String[] args) {
        int arr[] = {3,1,4,1,5};
        System.out.println("Missing Number " + findMissingNumber(arr));
        System.out.println("Repeating Number:"+findRepeatingNumber(arr));
    }

    private static int findRepeatingNumber(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    private static int findMissingNumber(int arr[]) {
        int i=1;
        for(;i<arr.length;i++){
            int found=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] ==i){
                    found = 1;
                    break;
                }
            }
            if(found ==0) return i;

        }
        return i;
    }
}
