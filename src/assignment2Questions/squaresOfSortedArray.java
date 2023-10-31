package assignment2Questions;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class squaresOfSortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int length = scan.nextInt();
//        int[] arr = new int[length];
        int[] arr = {-4, -1, 0, 3, 10};
        for (int value :
                arr) {
            System.out.printf("%d\t", value);
        }
        System.out.println();


        // Squaring values in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        for (int value :
                arr) {
            System.out.printf("%d\t", value);
        }
        System.out.println();

        // Sorting array (using bubble)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == arr.length-1){
                    break;
                }
                else if (arr[j] > arr[j+1]){
                    int backup = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = backup;
                }
            }
        }



        // Printing array
        for (int value :
                arr) {
            System.out.printf("%d\t", value);
        }

    }
}
