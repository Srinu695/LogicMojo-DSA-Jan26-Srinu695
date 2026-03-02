package com.logicmojo.java.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q4LongestSubstringWithKDistinctCharacters {

    public static void main(String[] args) {
        String s = "baeceececec";
        int k =2; //window
        System.out.println(findLongestSubstringWithKDistinctChars(s,k));

    }

    private static int findLongestSubstringWithKDistinctChars(String s, int k) {
        int j=0,i=0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxLength = 0;
        while(j<s.length()){
            char windowStartChar = s.charAt(j);
            frequencyMap.put(windowStartChar, frequencyMap.getOrDefault(windowStartChar,0)+1);

            if(frequencyMap.size() > k){
                char windowEndChar = s.charAt(i);
                if(frequencyMap.containsKey(windowEndChar)){
                    int count = frequencyMap.get(windowEndChar);
                    count--;
                    if(count >0){
                        frequencyMap.put(windowEndChar,count);
                    }
                    else{
                        frequencyMap.remove(windowEndChar);
                    }
                    i++;
                }

            }
            maxLength = Math.max(maxLength, j-i+1);
            j++;

        }

        return maxLength;
    }
}
