package assignment2Questions;

import java.util.Scanner;

public class runningSumOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        int runningSum = 0;
        for (int i = 0; i < length; i++) {
            runningSum += arr[i];
            System.out.printf("%d ", runningSum);
        }
    }
}
