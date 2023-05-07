package org.example.random;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public  int lonelyInteger(List<Integer> a) {
        HashMap<Integer,Integer> myMap = new HashMap<Integer, Integer>();

        a.stream().forEach( x->
        {
            if ( myMap.containsKey(x)){
                myMap.put(x, myMap.get(x).intValue() + 1);
            }else {
                myMap.put(x, 1);
            }

        });
        for (Map.Entry<Integer,Integer> set : myMap.entrySet()) {
            if (set.getValue().equals(1)) {
                System.out.println(set.getKey());
                return set.getKey();
            }
        }
        return 0;
    }
}
