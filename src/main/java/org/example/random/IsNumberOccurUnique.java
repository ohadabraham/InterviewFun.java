package org.example.random;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsNumberOccurUnique {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> numbersMap = new HashMap<>();
        Arrays.stream(arr).forEach( x-> {
            if ( numbersMap.containsKey(x)) {
                numbersMap.put(x , numbersMap.get(x) + 1);

            }else {
                numbersMap.put(x ,  1);
            }
        });
        Set<Integer> mySet = new HashSet<>(numbersMap.values());

        if ( mySet.size() != numbersMap.size()) {
            return false;
        }
        return true;
    }
}
