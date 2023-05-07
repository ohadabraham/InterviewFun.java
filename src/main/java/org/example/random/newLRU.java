package org.example.random;

import java.util.HashMap;
import java.util.LinkedList;

public class newLRU {

    private int size;
    private HashMap <Integer,Integer> dataMap;
    private LinkedList<Integer> linkedList;

    public newLRU ( int size) {
        this.size = size;
        this.dataMap= new HashMap<>();
        this.linkedList= new LinkedList<>();
    }

    public Integer get ( int key ){
        // check if map contain key
        if ( dataMap.containsKey(key)) {
            linkedList.remove(key);
            linkedList.addFirst(key);
            return dataMap.get(key);
        }
        return null;
    }

    public void put ( int key , int value ){

        // check if map contain key
        //check if we reach size
        if ( dataMap.containsKey(key) ){
            // make it first
        }else {
            if ( dataMap.size() == size) {
                // we need to drop 1 item as we reach max size
            }else {

            }
        }

    }


 //   public class NewNode {
 //       private int value;
 //       private newNode next;
  //  }
}
