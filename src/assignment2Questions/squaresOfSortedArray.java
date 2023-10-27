package assignment2Questions;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class squaresOfSortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int length = scan.nextInt();
//        int[] arr = new int[length];
        int[] arr = {-9, 2, 3, 4, 5};
        for (int value :
                arr) {
            System.out.printf("%d\t", value);
        }
        System.out.println();

        // Inserting values into array
//        for (int i = 0; i < length; i++) {
//            arr[i] = scan.nextInt();
//        }

        // Squaring values in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        for (int value :
                arr) {
            System.out.printf("%d\t", value);
        }
        System.out.println();

        // Sorting array
        Arrays.sort(arr);
//        for (int i = 0; i < length; i++) {
//
//        }

        // Printing array
        for (int value :
                arr) {
            System.out.printf("%d\t", value);
        }

    }
}
