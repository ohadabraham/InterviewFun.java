package org.example.random;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class RandomNumber1Till9 {
    public  long getRandomNum1Till9 () {

        long l = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) % 9 + 1;
        System.out.print("Random number is " + l);
        return l;
    }
}
