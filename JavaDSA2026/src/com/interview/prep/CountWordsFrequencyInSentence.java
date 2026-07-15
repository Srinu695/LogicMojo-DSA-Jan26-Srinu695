package com.interview.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsFrequencyInSentence {

    public static void main(String[] args) {
        String inputSentence = "This is practice to get in to product based company";

        Map<String, Integer> frequncyMap = hashMapApproach(inputSentence);
        System.out.println(frequncyMap);

        System.out.println("=======Streams Approach=======");
        streamsApproach(inputSentence);

    }

    private static void streamsApproach(String inputSentence) {

        Map<String, Long> freqMap =
                Arrays.stream(inputSentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        /*for(String key: freqMap.keySet()){
            System.out.println( key + "-->" + freqMap.get(key));
        }*/

        freqMap.forEach(
                (word, count) -> System.out.print(word + "-->"+ count + " "));
    }

    private static Map<String, Integer> hashMapApproach(String inputSentence) {

        String[] words = inputSentence.split(" ");
        Map<String, Integer> frequncyMap = new HashMap<>();
        for(String word: words){
            frequncyMap.put(word, frequncyMap.getOrDefault(word,0)+1);
        }

        return frequncyMap;

    }
}
