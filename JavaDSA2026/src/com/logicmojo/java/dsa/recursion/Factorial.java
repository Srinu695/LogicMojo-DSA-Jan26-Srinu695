package com.logicmojo.java.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("========Factorial=============");
        System.out.println(findFactorial(num));

    }

    private static int findFactorial(int num) {
        if (num == 1) {
            return 1;
        }
        int left = num;
        int right = findFactorial(num - 1);
        int ans = left * right;
        return ans;
    }
}
