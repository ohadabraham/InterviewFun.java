package org.example.random;

import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i); // sum of the elements in the primary diagonal
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i); // sum of the elements in the secondary diagonal
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);


    }
}
