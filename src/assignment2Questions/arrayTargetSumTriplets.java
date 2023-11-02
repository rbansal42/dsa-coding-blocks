package assignment2Questions;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTargetSumTriplets {
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

        // Finding and printing triplet that sum-up to target

        for (int i = 0, j = len - 1, k = i + 1; i < j; ) {

            int sum = arr[i] + arr[j] + arr[k];
            // If target found

            if (sum == target) {
                System.out.printf("%d, %d and %d\n", arr[i], arr[k], arr[j]);

                if (k + 1 >= j - 1) {
                    i++;
                    k = i + 1;
                } else {
                    k++;
                    j--;
                }
            } else if (sum > target) {
                j--;
            } else if (sum < target) {
                k++;
            }
        }
    }
}
