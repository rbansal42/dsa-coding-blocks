package assignment2Questions;

import java.util.Scanner;

public class moveZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                arr[i] = 0;
                index++;
            }
        }

        for (int value :
                arr) {
            System.out.print(value + ", ");
        }
    }
}
