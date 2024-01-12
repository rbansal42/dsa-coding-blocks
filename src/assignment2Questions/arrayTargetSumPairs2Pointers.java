package assignment2Questions;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTargetSumPairs2Pointers {
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

        for (int i = 0, j = len - 1; i < j; ) {

            // If target found
            int sum = arr[i] + arr[j];

            // Terminating conditions
            if (sum == target) {
                System.out.printf("%d and %d\n", arr[i], arr[j]);

                i++;
                j--;
            }
            // If sum greater than target
            else if (sum > target) {
                j--;
            }
            // If sum less than target
            else if (sum < target) {
                i++;
            }

        }
    }
}
