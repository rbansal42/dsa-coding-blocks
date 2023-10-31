package assignment2Questions;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting length of array
        int length = scan.nextInt();

        // creating array of the length
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        // Reversing

        for (int i = 0, j = length - 1; i <= j; i++, j--) {
            int backup = arr[j];
            arr[j] = arr[i];
            arr[i] = backup;
        }

        for (int value :
                arr) {
            System.out.println(value);
        }
    }
}
