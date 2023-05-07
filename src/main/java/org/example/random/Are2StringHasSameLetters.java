package org.example.random;

import java.util.HashSet;
import java.util.Set;

public class Are2StringHasSameLetters {

    public void getAre2StringHasSameLetters ( String str1 , String str2 ){
        Set<Character> char1 = new HashSet<>();
        Set<Character> char2 = new HashSet<>();
        for ( Character ch : str1.toCharArray() ){
            char1.add(ch);
        }
        for ( Character ch : str2.toCharArray() ){
            char2.add(ch);
        }
        if ( char1.equals(char2)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
