package assignment2Questions;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTargetSumPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declaring array of size 'len'
        int len = scan.nextInt();
        int[] arr = new int[len];

        // Taking input for arrays
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        // input for Target Sum
        int target = scan.nextInt();

        // Finding and printing pair that sum-up to target

        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("%d and %d\n", arr[i], arr[j]);
                }
            }
        }
    }
}
