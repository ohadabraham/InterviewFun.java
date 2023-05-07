package org.example.random;

public class SlidingWindow {

    int [] arr = {5,2,3,4,1};
    int k=3;

    public int findSlidingWindow (  ) {

        int start = 0; //0
        int curr = k-start ; //2
        int maxSum = 0;

        for ( int i=0; i < k ; i ++ ){
            maxSum+=arr[i];
        }
        start =0;
        curr = k;

        while ( start < arr.length && curr < arr.length ) {
            int tempMaxSum = maxSum - arr[start] + arr[curr];
            if ( tempMaxSum > maxSum ) {
                maxSum=tempMaxSum;
            }
            start++;
            curr++;
        }
       // int tempMaxSum = maxSum - arr[start] + arr[curr];
        System.out.println(maxSum);
        return maxSum;
    }
}
