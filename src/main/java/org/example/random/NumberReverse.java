package org.example.random;

public class NumberReverse {

    public int getRevereseNumber ( int num ) {
        int mod;
        int response = 0;

        //124
        while ( num  > 0 ){
            mod = num % 10;
            response = ( response ) * 10 + mod;
            num = num/10;
        }
        System.out.print("New number is "+ response);
        return response;
    }
}
