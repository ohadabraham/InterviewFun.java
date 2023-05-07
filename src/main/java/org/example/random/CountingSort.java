package org.example.random;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        // [1,1,3,2,1]
        // [0,3,1,1]
        List <Integer> result = new ArrayList<>();
        int max = arr.stream().max(Comparator.comparing(Integer::intValue)).orElse(0);

        if ( max == 0 )
        {
            return result;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        arr.stream().forEach(x-> {
            if ( map.containsKey(x) ){
                map.put(x,map.get(x)+1);
            }else {
                map.put(x, 1);
            }
        });
        return new ArrayList<>(map.values());
    }
}
