package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class STreamPlayground {

    // simple stream - loop array
    List<Integer> intArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,1));
    public void playWithStremArray () {
        List<Integer> intArray1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1));

        // print
        intArray.stream().forEach(System.out ::println);
        intArray.stream().forEach(x-> {
            System.out.println(x.intValue());
        });
        // fiter
        intArray.stream().filter(x->
                x > 3
        ).forEach(System.out::println);
        intArray.stream().filter(x->
            x > 3
        ).collect(Collectors.toList());
        int mult = intArray.stream().reduce(1 ,(a,b) -> (a*b));

        intArray.stream().distinct();
        intArray.stream().sorted();
        intArray.stream().limit(10);
        intArray.stream().skip(10);
      //  intArray1.stream().flatMap(List::stream).collect(Collectors.toList());
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

// Using map()
        List<Integer> mappedList = listOfLists.stream()
                .map(List::size)
                .collect(Collectors.toList());

        System.out.println(mappedList); // Output: [3, 3, 3]

// Using flatMap()
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

    }
}
