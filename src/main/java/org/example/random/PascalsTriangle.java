package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List <List<Integer>> getPascalsTriangle ( int numOfRows ) {
        List<List<Integer>> response = new ArrayList<>();

        if (numOfRows == 0) {
            return response;
        }

        response.add(Arrays.asList(new Integer(1)));
        System.out.print("[1]\n");

        for (int i = 1; i < numOfRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = response.get(i - 1);
            row.add(1);
            System.out.print("[1,");
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
                System.out.print(prevRow.get(j-1) + prevRow.get(j) + ",");
            }
            row.add(1);
            response.add(row);

            System.out.println("1]");

        }
        return  response;
    }
}
