package com.logicmojo.java.dsa.strings;

public class checkIfStringIsPalindrome {

    public static void main(String[] args) {
        String input = "noon";
        System.out.println(checkIfPalindrome(input));
    }

    private static int checkIfPalindrome(String s) {
        int i=0;int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return 0; //Not a palindrome
            }
            i++;j--;

        }
        return 1; // True its a palindrome
    }
}
