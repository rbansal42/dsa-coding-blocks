package assignment2Questions;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTargetSumTriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Making an array of length of length
        int length = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        // Target
        int target = scan.nextInt();

        Arrays.sort(arr);

        int start = 0;

        while (start < length - 1) {
            int k = start + 1;
            int end = length - 1;
            while (end > k) {
                int sum = arr[start] + arr[end] + arr[k];

                if (sum == target) {
                    System.out.printf("%d, %d and %d\n", arr[start], arr[k], arr[end]);
                    k++;
                    if (k != end) {
                        end--;
                    }
                } else if (sum > target) {
                    end--;
                } else {
                    k++;
                }
            }
            start++;
        }
    }
}
