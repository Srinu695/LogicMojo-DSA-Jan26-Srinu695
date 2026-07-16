package com.interview.prep.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToFrequncyChar {

    public static void main(String[] args) {
        String input = "giveninput";

        Map<Character, Integer> freqMap = new HashMap<>();
        for(int index=0; index< input.length(); index++){
            freqMap.put(input.charAt(index),
                    freqMap.getOrDefault(input.charAt(index),0)+1);
        }

        System.out.println(freqMap);



        Map<Character, Long> freqCharMap = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("freqCharMap"+ freqCharMap);

        Map.Entry<Character, Long> firstRepeating = freqCharMap.entrySet().stream()
                .filter(e -> e.getValue() > 1).findFirst().get();
        System.out.println(firstRepeating.getKey());
    }
}
