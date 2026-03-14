package com.logicmojo.java.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 37184;
        System.out.println("============Sum of digits===========");
        System.out.println(findSumOfDigits(num));
    }

    private static int findSumOfDigits(int num) {
        if(num ==0){
            return 0;
        }
        int left = num%10;
        int right = findSumOfDigits(num/10);
        int ans =  left + right;
        return ans;
    }
}
