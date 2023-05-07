package org.example.random;

public class ReverseString {

    public static String reverseString ( String sentence ) {
        String [] words  =sentence.split(" ");
        StringBuilder reverseSentence = new StringBuilder();

        for ( String word : words ) {
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            reverseSentence.append(reverseWord + " ");
        }

        reverseSentence.reverse();
        return reverseSentence.toString();
    }
}
