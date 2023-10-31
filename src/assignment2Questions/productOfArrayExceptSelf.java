package assignment2Questions;

import java.util.Scanner;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr = new int[length];
        // Taking array input
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        int[] productFromRight = new int[length];

        // Right product array
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            rightProduct = rightProduct * arr[i];
            productFromRight[i] = rightProduct;
        }

        // Answer array
        int[] ansArr = new int[length];

        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {

                ansArr[i] = leftProduct;
            } else {
                ansArr[i] = leftProduct * productFromRight[i + 1];
            }
            leftProduct *= arr[i];
        }

        // Printing array
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", ansArr[i]);
        }
    }
}
