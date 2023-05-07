package org.example.random;

import java.util.ArrayList;
import java.util.List;

public class SumOfFactors {

    public  void getSumOfFactor ( int [] n ) {
        List<Integer> result = new ArrayList<>();
        for (int num : n) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    sum += ( i + num/1);
                }
            }
            result.add(sum);
        }

        System.out.println(result);
    }
}
