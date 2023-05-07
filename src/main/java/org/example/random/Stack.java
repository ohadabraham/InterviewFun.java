package org.example.random;

import java.util.LinkedList;

public class Stack {

    public LinkedList<Node> stack = new LinkedList<>();

    //push to tail
    public void push ( Integer val ){
        Node newNode = new Node(val);
        newNode.value=val;

        if ( stack.isEmpty() ) {
            stack.push(newNode);
            return;
        }
        Node curr = stack.peek();
        while ( curr.left != null ) {
            curr=curr.left;
        }
        curr.left=newNode;
    }
    //pop from tail
    public void pop (  ){
        Node prev = stack.peek();
        Node curr = prev;
        if ( stack.isEmpty() || curr.left ==null ) {
            stack= new LinkedList<>();
        }
        else {
            while (curr.left != null) {
                prev = curr;
                curr = curr.left;
            }
            prev.left=null;

        }

    }
    //pop from tail
    public void print ( ){
        Node curr = stack.peek();
        while ( curr != null ) {
            System.out.print(curr.value+"=>");
            curr=curr.left;
        }
        System.out.print("null\n");

    }

}


