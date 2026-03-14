package com.logicmojo.java.dsa.recursion;

public class Power {
    public static void main(String[] args) {
        int num = 4, power = 3;
        System.out.println("=========Power Function===========");
        System.out.println(findPower(num, power));
    }

    private static int findPower(int num, int power) {
        if(power == 1){
            return num;
        }
        int left = num;
        int right = findPower(num, power-1);
        int ans =  left * right;
        return ans;
    }
}
