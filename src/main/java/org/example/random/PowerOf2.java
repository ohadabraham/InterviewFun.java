package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerOf2 {

    public boolean getIsPowerOf2 ( int num ) {
        if ( num <=0 ) {
            return false;
        }
        if ( num ==1 ) {
            return true;
        }
        if ( num % 2 !=0 ) {
            return false;
        }
        while ( num  > 2 ) {

            num = num / 2;
            if ( num % 2 != 0 ) {
                return false;
            }

        }
        return true;

    }

    public boolean getIsPowerOf2Another ( int num ) {
        if ( num <=0 ) {
            return false;
        }
        if ( num ==1 ) {
            return true;
        }
        int number =1;
        while ( number  <= num  ) {

            if (num == number) {
                return true;
            }
            number *= 2;
         }
         return false;

    }
}
