package org.example.random;

import java.util.LinkedList;

public class NthNodeFromEndLinkedList {

    private LinkedList <Node> nodes = new LinkedList<>();
    public void getNthNodeFromEndLinkedList( int n) {

        Node n1 = new Node(1);
        n1.value=1;
        Node n2 = new Node(2);
        n2.value=2;
        Node n3 = new Node(3);
        n3.value=3;
        Node n4 = new Node(4);
        n4.value=4;
        Node n5 = new Node(5);
        n5.value=5;
        n5.left=null;
        n4.left=n5;
        n3.left=n4;
        n2.left=n3;
        n1.left=n2;

        nodes.add(n1);
        //1->2->3->4->5->||
        Node curr = nodes.get(0);
        Node nth = nodes.get(0);
        int currIndex =0;
        while ( currIndex < n )
        {
            curr=curr.left;
            currIndex++;
        }
        while ( curr != null ){
            curr=curr.left;
            nth=nth.left;
        }

        System.out.println("The nth values id " + nth.value);

    }
}
