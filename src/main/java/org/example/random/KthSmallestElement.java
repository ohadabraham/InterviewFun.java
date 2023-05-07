package org.example.random;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElement {
    public void getKthSammlestElement  (int [] intArr , int k) {
        System.out.print( "\nbefore sort \n");
        Arrays.stream(intArr).forEach(x-> System.out.print( x));
        System.out.print( "\n after sort \n");
        Arrays.sort(intArr);
        Arrays.stream(intArr).forEach(x-> System.out.print( x));

        System.out.print(" \nelement is " +intArr[k-1]);
    }
}
