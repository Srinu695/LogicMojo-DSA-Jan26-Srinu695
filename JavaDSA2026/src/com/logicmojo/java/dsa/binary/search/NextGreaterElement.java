package com.logicmojo.java.dsa.binary.search;

/**
 * This finds the next greater elment like ceil for given char array
 * We are using ascii values f characters to compare
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        char arr[] = {'d', 'g', 'l', 'w', 'y'};
        char target = 'b';
        System.out.println(findGreaterElement(arr, target));
    }

    private static char findGreaterElement(char[] arr, char target) {
        int i=0,j=arr.length-1;
        int targetAscii = target;
        int ans = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int midAscii = arr[mid];
            if(midAscii >= targetAscii){
                // If mid index value is higher, its potential candidate for answer,
                // so we store index value and discard rhs
                ans = mid;
                j=mid-1;

            }
            else{
                i = mid+1;
                //discard lhs
            }
        }
        return arr[ans];
    }
}
