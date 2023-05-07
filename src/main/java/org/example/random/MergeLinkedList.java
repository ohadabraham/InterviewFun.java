package org.example.random;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeLinkedList {

    public static LinkedList<Integer> merge2LinkedList ( LinkedList<Integer> link1 ,  LinkedList<Integer> link2) {
        LinkedList<Integer> newLinked = new LinkedList<>();

        while ( !link1.isEmpty() && !link2.isEmpty() ) {
            if ( link2.getFirst() > link1.getFirst() ) {
                newLinked.add(link1.getFirst());
                link1.removeFirst();
            }else {
                newLinked.add(link2.getFirst());
                link2.removeFirst();
            }
        }
        newLinked.addAll(link1);
        newLinked.addAll(link2);

        return newLinked;
    }
    public static LinkedList<Integer> merge2LinkedList2 ( LinkedList<Integer> link1 ,  LinkedList<Integer> link2) {
        LinkedList<Integer> newLinked = new LinkedList<>();

        Iterator<Integer> it1 = link1.listIterator();
        Iterator<Integer> it2 = link2.listIterator();
        while ( it1.hasNext() && it2.hasNext() ){
            int val1= it1.next();
            int val2 = it2.next();
            if ( val1 > val2 )
            {
                newLinked.add(val2);
            }else {
                newLinked.add( val1);
            }
        }

        return newLinked;
    }
}
