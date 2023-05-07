package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {


    public static List <List<Integer>> getArrayList (List <Integer> intArr) {

        List <List<Integer>> response = new ArrayList<>();
        int sizeArray = intArr.size();
        if ( intArr.size() > 0 ) {
            // will add []
            response.add(new ArrayList<>());
        }


        for (int i =0 ; i < sizeArray ; i++  ) {
            // will add 1 , 2, 3
            response.add(Arrays.asList(intArr.get(i)));
            List <Integer> allFeilds = new ArrayList<>();

            // will add 1 to sub array
            allFeilds.add(intArr.get(i));
            for (int j =i+1 ; j < sizeArray ; j++  ) {
                // 2 | 3
                allFeilds.add(intArr.get(j));
                response.add(allFeilds);
            }
            //Math.pow(2,sizeArray)
            response.add(allFeilds);


        }
        return response;
    }


    private static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<Integer>(), subsets);
        return subsets;
    }

    private static void backtrack(int[] nums, int start, List<Integer> subset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<Integer>(subset));

        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, subsets);
            subset.remove(subset.size() - 1);
        }
    }

    private static List<List<Integer>> generateSubsets1(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // add empty subset
        for (int i = 0; i < nums.length; i++) {
            int size = subsets.size();
            for (int j = 0; j < size; j++) {
                List<Integer> subset = new ArrayList<>(subsets.get(j)); // make a copy of the subset
                subset.add(nums[i]);
                subsets.add(subset);
            }
        }
        return subsets;
    }
}
