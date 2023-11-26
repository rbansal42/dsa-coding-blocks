package assignment2Questions;

import java.util.Scanner;

public class bestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] arr = arrayOperations.scanArray();
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = Integer.MIN_VALUE;
        int maxProfit = sellPrice - buyPrice;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int difference = arr[j] - arr[i];
                maxProfit = Math.max(difference, maxProfit);
            }
        }

        System.out.println(maxProfit);
    }
}
