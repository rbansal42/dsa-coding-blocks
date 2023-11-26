package assignment2Questions;

import java.util.Scanner;

public class divisbleSubarrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int validSubarrays = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum % arr.length == 0) {
                    validSubarrays++;
                }
            }
        }

        System.out.println(validSubarrays);

    }
}
