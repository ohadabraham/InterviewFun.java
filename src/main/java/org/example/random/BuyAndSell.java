package org.example.random;

public class BuyAndSell {

    public void getBuyAndSell(int[] arr) {
        int minIndex = -1;
        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (minIndex == -1 || arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (maxIndex == Integer.MIN_VALUE || arr[j] > arr[maxIndex] && arr[j] > arr[i]) {
                    maxIndex = j;
                }
            }
        }

        System.out.print("Is is best buy at " + minIndex + " and sell at " + maxIndex);
        int result = arr[maxIndex] - arr[minIndex];
        System.out.print("\nyou will sell in " + arr[maxIndex] + " while you bought in " + arr[minIndex] + " , so your profit is " + result);

    }

    public static void getBuyAndSell1(int[] arr) {
        int minIndex =0;
        int maxIndex =0;
        int maxProfit=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j]-arr[i];
                if ( profit > maxProfit ) {
                    maxProfit=profit;
                    maxIndex=j;
                    minIndex=i;
                }
            }
        }
        System.out.println("Max Profit :" + maxProfit +".index to buy " + minIndex + " , index to sell " + maxIndex);
    }
}