package org.example.random;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static Node  reverseLinkedList ( Node headOfLinkedList ) {
        Node head = headOfLinkedList;
        Node curr = head;
        Node prev = null;


        while ( curr != null ) {
            Node newNode = curr.left;
            curr.left=prev;
            prev=curr;
            curr = newNode;
        }

        return prev;
    }
}
