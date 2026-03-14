package com.logicmojo.java.dsa.recursion;

public class PrintSumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("==========Sum of N Natural Numbers===========");
        System.out.println(findSumOfNNaturalNumbers(n));
    }

    private static int findSumOfNNaturalNumbers(int n) {
        if(n==1){
            return 1;
        }
        int left = n;
        int right = findSumOfNNaturalNumbers(n-1);
        int ans = left + right;
        return  ans;

    }
}
