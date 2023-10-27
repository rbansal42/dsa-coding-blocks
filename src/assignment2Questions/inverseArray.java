package assignment2Questions;

import java.util.Scanner;

public class inverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting length of array
        int length = scan.nextInt();

        // creating array of the length
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        arr = inverseArray(arr);

        for (int value :
                arr) {
            System.out.printf("%d ", value);
        }
    }

    public static int[] inverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]] = i;
        }
        return arr2;
    }
}
