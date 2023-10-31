package assignment2Questions;

import java.util.Scanner;

public class maxSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < len; i++) {
            sum += arr[i];
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);

    }
}
