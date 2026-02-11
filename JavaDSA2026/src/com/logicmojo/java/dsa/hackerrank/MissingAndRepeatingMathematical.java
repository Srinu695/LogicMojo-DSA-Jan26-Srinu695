package com.logicmojo.java.dsa.hackerrank;

/**
 * Gives repeating and missing number in an array assuming numbers wil be from 1 to n
 */
public class MissingAndRepeatingMathematical {

    public static void main(String[] args) {
        int arr[]= {3,1,3};
        findMissingAndRepeating(arr);
    }

    private static void findMissingAndRepeating(int[] arr) {
        long arraySum=0,arraySquaresSum=0,n=arr.length;
        long expectedArraySum=0,expectedSqauresSum=0;
        for(int i: arr){
            arraySum += i;
            arraySquaresSum += i*i;
        }
            expectedArraySum =  (n * (n+1))/2; // Sum of n natural numbers
            expectedSqauresSum = (n * (n+1) *(2 * n +1))/6;     // Sum of squares of natural numbers
            long diff1 = arraySum - expectedArraySum;
            long diff2 = arraySquaresSum - expectedSqauresSum;
            long sumAb = diff2/diff1;   //A-B = A^2-B^2/(A+B)
            int a = (int) (sumAb + diff1)/2; // Repeating Number
            int b = (int) sumAb - a; // Missing number
        System.out.println(a + " " + b);
    }
}
