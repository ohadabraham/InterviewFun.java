package org.example.random;

import java.util.HashMap;
import java.util.LinkedList;

public class LRU {

    private int size;
    private HashMap < Integer , Integer > dataHashMap;
    private LinkedList <Integer> orderLinkedList;

    public LRU ( int size ) {
        this.size=size;
        dataHashMap = new HashMap<>();
        orderLinkedList = new LinkedList<>();
    }
    public void put (int key , int value){

        if ( !dataHashMap.containsKey( key )) {

            if ( orderLinkedList.size() == size ){
                Integer val = orderLinkedList.removeLast();
                dataHashMap.remove(val);
            }
            orderLinkedList.addFirst(key);
            dataHashMap.put(key,value);
        }else {
            orderLinkedList.remove(key);
            dataHashMap.put(key,value);
            orderLinkedList.addFirst(key);

        }
    }

    public Integer get (  int key ){

        if ( dataHashMap.containsKey( key )) {
            orderLinkedList.remove(key);
            orderLinkedList.addFirst(key);
            return dataHashMap.get(key);
        }
        return null;
    }
}

