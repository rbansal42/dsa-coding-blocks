package assignment2Questions;

import java.util.Scanner;

public class bestTimeToBuyAndSell {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);

        int[] arr = {7, 6, 4, 3, 1};

        int bestSellPrice = arr[1];
        int dayToSell = 1;

        for (int i = 1; i < arr.length; i++) {

            if (bestSellPrice < arr[i]) {
                bestSellPrice = arr[i];
                dayToSell = i;
            }
        }

        int bestBuyPrice = arr[0];
        int dayToBuy = 0;
        for (int i = 0; i <= dayToSell; i++) {
            if (bestBuyPrice > arr[i]) {
                bestBuyPrice = arr[i];
                dayToBuy = i;
            }
        }

        int ans = arr[dayToSell] - arr[dayToBuy];
        System.out.println(ans);

    }
}
