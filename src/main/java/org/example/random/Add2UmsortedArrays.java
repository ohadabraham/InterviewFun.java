package org.example.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Add2UmsortedArrays {

    public static Integer getCombinations(List <Integer> int1 , List <Integer> int2 , int sum ){
        HashMap <Integer, Integer > arr1InMap = new HashMap<>();
        int combination=0;
        for (Integer value : int1  )
        {
            if (arr1InMap.containsKey(value)) {
                arr1InMap.put(value, arr1InMap.get(value) + 1);
            } else {
                arr1InMap.put(value, 1);
            }

        }
        for (Integer value : int2  ) {
            if ( arr1InMap.containsKey( sum - value )){
                combination++;

            }

        }
        return combination;

    }

    public static Integer get2SumCombinationIn1Arr(List <Integer> int1 , int sum ){
        HashMap <Integer,Integer> map = new HashMap<>();
        for (Integer num : int1) {
            if ( map.containsKey(num)) {
                map.put(num, map.get(num) +1);
            }else {
                map.put(num,1);
            }
        }

        int counter = 0;
        for (Integer num : int1) {
            if ( map.containsKey(sum-num)) {
                counter++;
            }
        }
        return counter;
    }
    public static boolean get3SumCombinationIn1Arr(Integer [] int1  , int sum ){
        Arrays.sort(int1);
        int n = int1.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currSum = int1[i] + int1[left] + int1[right];
                if (currSum == sum) {
                    return true;
                } else if (currSum < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}
