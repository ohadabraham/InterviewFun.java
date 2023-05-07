package org.example.random;

import java.util.Random;

public class RandomInt {

    public void randomInt ( int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        Random rand = new Random();
        for (int i = N - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
