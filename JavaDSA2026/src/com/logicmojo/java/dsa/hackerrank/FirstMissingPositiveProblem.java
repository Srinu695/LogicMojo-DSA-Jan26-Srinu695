package com.logicmojo.java.dsa.hackerrank;

public class FirstMissingPositiveProblem {
    public static void main(String[] args) {
        int arr[] = {3,4,2,-1,1};
        System.out.println(findFirstMissingPositiveInteger(arr));

        System.out.println(findMissingFirstPositiveIntegerOptimised(arr));

    }

    private static int findMissingFirstPositiveIntegerOptimised(int[] arr) {
        for(int i=0;i<arr.length;i++){
            while(arr[i]> 0 && arr[i] <=arr.length && arr[i] != arr[arr[i]-1]){
                int correctIndex = arr[i] -1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] =temp;

            }


        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1)
                return i+1;
        }
        return arr.length+1;
    }

    private static int findFirstMissingPositiveInteger(int[] arr) {
        for(int i=1;i<=arr.length;i++){
            int found=0;
            for(int j=0;j<arr.length;j++){
                if(i == arr[j])
                    found=1;

            }
            if(found==0) return i;

        }
        return arr.length+1;
    }
}
