package org.example.random;

import java.util.HashMap;
import java.util.LinkedList;

public class DoSomthing {

    public void buyAnSell  (int  [] arr ) {
        int buyIndex=0;
        int sellIndex=0;
        int maxProfit=0;

        for ( int i=0;i<arr.length; i ++) {
            for ( int j=i+1;j<arr.length; j ++) {
                int profit = arr[j]-arr[i];
                if ( profit > maxProfit ) {
                    maxProfit=profit;
                    buyIndex=i;
                    sellIndex=j;
                }
            }
        }
        System.out.println("Buy at "+buyIndex + "Sell at " +sellIndex+ "Profit is +" + maxProfit);
    }




    public class myLRU {
        private HashMap <Integer , Integer > map;
        private LinkedList <Integer> linked;
        private int size;


        public myLRU (int size) {
            this.size=size;
            map = new HashMap<>();
            linked= new LinkedList<>();

        }

        public Integer get ( int key ) {
            if ( map.containsKey(key)) {
                linked.remove(key);
                linked.addFirst(key);
                return map.get(key);
            }
            return null;
        }
        public void put ( int key , int value ) {
            if ( map.containsKey(key) ) {
                linked.remove(key);
                linked.addFirst(key);
            }else {

                if (linked.size() == size) {
                    linked.remove();
                    map.remove(key);
                }
                linked.addFirst(key);
                map.put(key,value);
            }
        }
    }
}



