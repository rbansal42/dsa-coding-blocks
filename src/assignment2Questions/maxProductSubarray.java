package assignment2Questions;

import java.util.Scanner;

public class maxProductSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        int product = 1;
        int max = arr[0];

        for (int i = 0; i < len; i++) {
            product *= arr[i];
            max = Math.max(product, max);

            if (product < 0) {
                product = 0;
            }
        }

        System.out.println(max);

    }
}
