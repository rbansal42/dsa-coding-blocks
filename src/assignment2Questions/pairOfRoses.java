package assignment2Questions;

import java.util.Arrays;
import java.util.Scanner;

public class pairOfRoses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();

        for (int testCase = 1; testCase <= testCases; testCase++) {
            // Making an array of size length
            int length = scan.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = scan.nextInt();
            }

            Arrays.sort(arr);

            int money = scan.nextInt(); // Deepak has 'money'

            int price1 = 0;
            int price2 = 0;
            int diff = Integer.MAX_VALUE;
            for (int i = 0, j = length - 1; i < j; ) {
                int sumOfCurrentPair = arr[i] + arr[j];
                if (sumOfCurrentPair == money) {
                    if (arr[j] - arr[i] < diff) {
                        price1 = arr[i];
                        price2 = arr[j];
                        diff = price2 - price1;
                    }
                    i++;
                    j--;
                } else if (sumOfCurrentPair > money) {
                    j--;
                } else {
                    i++;
                }
            }
            System.out.printf("Deepak should buy roses whose prices are %d and %d.\n", price1, price2);
        }
    }
}
