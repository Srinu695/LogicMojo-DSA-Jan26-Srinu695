package com.logicmojo.java.dsa.recursion;

public class SumOfAllElementsInArray {

    public static void main(String[] args) {
        int arr[] = {3,4,6,7,1};
        System.out.println("===========Sum of all elements=============");
        System.out.println(findSumOfAllElements(arr, 0));
    }

    private static int findSumOfAllElements(int[] arr, int index) {
        if(arr.length == index){
            return 0;
        }
        int left = arr[index];
        int right = findSumOfAllElements(arr, index + 1);
        int ans = left + right;
        return ans;
    }
}
