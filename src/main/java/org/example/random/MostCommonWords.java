package org.example.random;

import java.util.*;

public class MostCommonWords {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph= paragraph.replaceAll("[^A-Za-z0-9 ]", "");
        paragraph = paragraph.toLowerCase();
        HashMap <String , Integer> mostFrequent = new HashMap<>();

        String [] strings = paragraph.split(" ");
        for ( String str : strings ) {
            if (Arrays.stream(banned).findAny().get().equals(str)) {
                // do nothing
            }else {
                if ( mostFrequent.containsKey(str)) {
                    mostFrequent.put(str, mostFrequent.get(str) +1);
                }else {
                    mostFrequent.put(str,1);
                }
            }
        }
        String single = Collections.max(mostFrequent.entrySet(),Comparator.comparingInt(Map.Entry::getValue)).getKey();
        System.out.println(single);

        return single;

    }

}
