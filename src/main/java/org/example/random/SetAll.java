package org.example.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SetAll {
    public String value4All;
    public HashMap <String,String> myHashMap = new HashMap<>();

    public String getValue ( String key ){
        if ( myHashMap.containsKey(key)){
            if (value4All!= null ) {
                return value4All;
            }
            return myHashMap.get(key);
        }
        return "None";

    }
    public void setValue ( String key , String value ){
        myHashMap.put(key,value);
        return;
    }
    public void setAllValues ( String value ){
        value4All = value;
        return;
    }
    public void print (  ){
        for (Map.Entry<String,String> entry : myHashMap.entrySet()) {
            if ( value4All != null ){
                System.out.print("\nkey " + entry.getKey() + " value " +value4All);

            }else{
                System.out.print("\nkey " + entry.getKey() + " value " +entry.getValue());

            }
        }
    }
}
