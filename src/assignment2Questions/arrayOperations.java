package assignment2Questions;

import java.util.Scanner;

public class arrayOperations {
    public static int[] scanArray() {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        return arr;
    }

    public static int[] scanArray(int[] arr) {
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int element :
                arr) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }

}
