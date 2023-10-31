package assignment2Questions;

import java.util.Scanner;

public class iceCream {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting length of array
        int length = scan.nextInt();

        // creating array of the length
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        int minWeightAtIndex = 0;

        for (int i = 0; i < length; i++) {
            if (arr[minWeightAtIndex] > arr[i]) {
                minWeightAtIndex = i;
            }
        }

        System.out.println(minWeightAtIndex + 1);
    }
}
