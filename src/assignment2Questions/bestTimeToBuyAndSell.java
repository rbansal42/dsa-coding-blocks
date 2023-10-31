package assignment2Questions;

import java.util.Scanner;

public class bestTimeToBuyAndSell {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);

        int[] arr = {7, 6, 4, 3, 1};

        int ans = 0;
        int bestBuy = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            bestBuy = Math.min(bestBuy, arr[i]);
        }

        System.out.println(ans);

    }
}
