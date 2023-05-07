package org.example.random;


public class Song implements  Comparable<Song>{

    public String name;
    public Double length;

    @Override
    public int compareTo(Song song) {
        if ( this.length > song.length) {
            return 1;
        } else if (this.length  == song.length) {

        }
        return -1;

    }

    public Song(String name, Double length) {
        this.name = name;
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}
