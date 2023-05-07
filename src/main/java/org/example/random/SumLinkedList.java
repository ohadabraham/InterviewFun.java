package org.example.random;

import java.util.Arrays;
import java.util.LinkedList;

public class SumLinkedList {

    LinkedList<Integer> intLinkedList1 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
    LinkedList<Integer> intLinkedList2 = new LinkedList<>(Arrays.asList(8,9,10));

    public void sumLinkedList () {
        int size1 = intLinkedList1.size();
        int size2= intLinkedList2.size();
        int size3 = Math.min(size2, size1);
        LinkedList<Integer> responseLinkedList = new LinkedList<>();


        int i = 0;
        while ( i < size3 ) {
            if ( size2 < size1 )
            {
                // loop over intLinkedList2
                responseLinkedList.add(intLinkedList1.get(i) + intLinkedList2.get(i));
                i++;
            }
        }
        while ( i < size1 ){
            responseLinkedList.add(intLinkedList1.get(i));
            i++;
        }
        responseLinkedList.stream().forEach(System.out::println);
    }
}
