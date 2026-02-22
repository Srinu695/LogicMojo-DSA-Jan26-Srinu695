package com.logicmojo.java.dsa.hackerrank.strings;

public class LongestSubStringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        //String input = "abcdaabcdef";
        String input = "bcadaadefg";
        System.out.println(findLongestSubStringLengthOptimised(input));
    }

    private static int findLongestSubStringLengthOptimised(String input) {
        int i=0,j=0,maxLength = 0;
        int frequencyArray[] = new int[26];
        while(j < input.length()){
            frequencyArray[input.charAt(j)-'a'] += 1;
            while(frequencyArray[input.charAt(j) -'a'] > 1){
                //shrink the window
                frequencyArray[input.charAt(i)- 'a'] -= 1; //decrease the frequency
                i++; // increment i pointer
            }
            maxLength = Math.max(maxLength, j-i+1); // get max length
            j++;
        }
        return maxLength;
    }
}
