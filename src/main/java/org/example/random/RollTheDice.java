package org.example.random;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RollTheDice {

    public int numRollsToTarget(int n, int k, int target) {

        // k - dice values
        // n - how many times
        // target - sum

        int options = 0;

        for ( int i =1 ; i <= k ; i ++ ){
            for ( int j =k ; j >= i; j --) {

                if (i + j == target ) {
                    options += 1;
                }

            }

        }
        options *= n;
        System.out.println("Options :" + options);
        return options;
    }


}
