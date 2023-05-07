package org.example.random;

public class MaxArraySunInArray {

    public void getSumOfMaxArray ( int [] arr ){
        int maxSum = Integer.MIN_VALUE;;
        int currSum = 0;


        for ( int num: arr ) {
            currSum+= num;
            if ( currSum > maxSum ) {
                maxSum=currSum;
            }
            if ( currSum < 0 ){
                currSum=0;
            }
        }
        System.out.print("max sum array is " + maxSum);

    }
}
