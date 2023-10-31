package assignment2Questions;

import java.util.Scanner;

public class maxValueInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting length of array
        int length = scan.nextInt();

        // creating array of the length
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        // Finding max
        int max = Integer.MIN_VALUE;
        for (int value :
                arr) {
            if (max < value) {
                max = value;
            }
        }

        System.out.println(max);

    }
}
