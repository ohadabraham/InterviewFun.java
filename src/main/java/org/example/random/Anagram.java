package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public List<List<String>> getAnagrams ( List<String> stringList ) {
        List<List<String>> strList = new ArrayList<>();
        HashMap<String , List<String>> strMap = new HashMap<>();
        for ( int i=0;i<stringList.size();i++ ) {
            for ( int j= i+1 ;j< stringList.size() ; j++) {
                if (compare2Strings(stringList.get(i),stringList.get(j))) {
                    char [] rts1 = stringList.get(j).toCharArray();
                    Arrays.sort(rts1);
                    String sorted = new String(rts1);
                    if ( strMap.containsKey( sorted)){
                        List <String> strut= strMap.get(sorted);
                        List <String> strutTemp = new ArrayList<>(strut);
                        strutTemp.add(stringList.get(j));
                        strMap.put(stringList.get(j),strutTemp);

                    }else{
                        strMap.put(sorted,Arrays.asList(stringList.get(j).toString()));
                    }}
            }
        }
        System.out.print("List of Strings");
        for (HashMap.Entry<String, List<String>> entry : strMap.entrySet()) {
            strList.add(entry.getValue());
            strList.stream().forEach(x-> {
                System.out.print(x);
            });

        }
        return  strList;
    }
    private boolean compare2Strings ( String str , String rts ){

        char [] str1 = str.toCharArray();
        char [] rts1 = rts.toCharArray();
        if ( str1.length != rts1.length ){
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(rts1);
        if ( !Arrays.equals(str1, rts1)){
            return false;
        }
        return true;

    }
}
