package org.example.random;

import java.util.Arrays;
import java.util.List;

public class LeftRotateArray {

    public void getLeftRotateArray ( int [] arr ){

        System.out.print("\nregular array");
        Arrays.stream(arr).forEach( x-> System.out.print(x + ","));


        int temp = arr[0];
        int j=1;
        for ( int i=0;i< arr.length-1 ; i++){
            arr[i]=arr[j];
            j++;
        }
        arr[arr.length-1]=temp;

        System.out.print("\nshift left array");

        Arrays.stream(arr).forEach( x-> System.out.print(x + ","));

    }


}
