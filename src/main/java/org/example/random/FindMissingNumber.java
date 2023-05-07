package org.example.random;

import java.util.*;

public class FindMissingNumber {

    public List<Integer> getMissingNumber ( int [] nums ) {
        List<Integer> result = new ArrayList<>();
        boolean [] seen = new boolean[nums.length];

       for ( int num : nums ){
           seen[num-1] = true;
       }
       for ( int i=0 ; i< seen.length ; i ++ ){
           if ( !seen[i] ){
               result.add(i+1);
           }
       }
       return result;
    }

}
