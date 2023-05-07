package org.example.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get((arr.size() - 1) / 2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        nums1=Arrays.stream(nums1).sorted().toArray();
        nums2=Arrays.stream(nums2).sorted().toArray();
        int [] nums3 = new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;
        while ( k < (nums1.length+nums2.length) ) {
            if ( i > nums1.length-1 ){
                nums3[k] = nums2[j];
                j++;
            }else if (  j > nums2.length-1 ) {
                nums3[k] = nums1[i];
                i++;
            }
            else if ( nums1[i] > nums2[j]){
                nums3[k] = nums2[j];
                j++;
            }else{
                nums3[k] = nums1[i];
                i++;
            }
            k++;

        }
        int median = 0;
        int s = nums3.length / 2;
        if ( (nums1.length + nums2.length)%2 == 0 ) {

            median = nums3[s-1] + nums3[s];
        }else {
            median = nums3[s+1];
        }
        return median;
    }

}