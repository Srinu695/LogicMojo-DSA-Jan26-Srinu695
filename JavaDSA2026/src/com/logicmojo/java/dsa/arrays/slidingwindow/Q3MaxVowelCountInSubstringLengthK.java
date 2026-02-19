package com.logicmojo.java.dsa.arrays.slidingwindow;

public class Q3MaxVowelCountInSubstringLengthK {

    public static void main(String[] args) {
        String input = "aeiou";
        int k = 3;

        System.out.println("===============BruteForce======================");
        System.out.println(findMaxCountOfVowelInSubstringBruteForce(input, k));
        System.out.println("===============Sliding Window==================");
        System.out.println(findMaxCountOfVowelInSubstringSlidingWindow(input, k));
    }

    private static int findMaxCountOfVowelInSubstringSlidingWindow(String input, int k) {
        int i=0,j=0,currentWindowVowelCount=0,maxVowelCount = Integer.MIN_VALUE;
        while(j< input.length()){
            char ch= input.charAt(j);
            if(isVowel(ch)){
                currentWindowVowelCount++;
            }

            if(j-i+1 == k){
                maxVowelCount = Math.max(currentWindowVowelCount, maxVowelCount);
                char c = input.charAt(i);
                if(isVowel(c)){
                    currentWindowVowelCount--;
                }
                i++;

            }
            j++;
        }
        return maxVowelCount;
    }

    private static int findMaxCountOfVowelInSubstringBruteForce(String input, int k) {
        int maxVowelCount = Integer.MIN_VALUE;
        for(int i=0;i<=input.length()-k;i++){
            int currentWindowVowelCount = 0;
            for(int j=i; j<i+k; j++){
                char ch = input.charAt(j);
                if(isVowel(ch)){
                    currentWindowVowelCount++;
                }
            }
            maxVowelCount = Math.max(currentWindowVowelCount, maxVowelCount);
        }
        return maxVowelCount;
    }

    private static boolean isVowel(char ch) {
        if(ch == 'a' || ch== 'e' || ch== 'i' || ch == 'o' || ch =='u'){
            return true;
        }
        return false;
    }
}
