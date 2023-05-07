package org.example.random;

import java.util.Arrays;
import java.util.Comparator;

public class SortSongs {

    public void getSortSongs ( Song []  songList) {
        System.out.print("\nRandom song list \n ");

        Arrays.stream(songList).forEach(
                x-> System.out.print("\nSong length " + x.name +" , Song size :" + x.length)
        );

        Arrays.sort(songList, Comparator.comparing(Song::getLength));
        System.out.print("\nSorted song list \n ");

        Arrays.stream(songList).forEach(
                x-> System.out.print("\nSong length " + x.name +" , Song size :" + x.length)
        );
    }
}
