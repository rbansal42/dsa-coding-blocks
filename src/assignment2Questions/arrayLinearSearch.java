package assignment2Questions;

import java.util.Scanner;

public class arrayLinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting length of array
        int length = scan.nextInt();

        // creating array of the length
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        int numToFind = scan.nextInt();
        int indexWithNum = -1;

        for (int i = 0; i < length; i++) {
            if (arr[i] == numToFind) {
                indexWithNum = i;
                break;
            }
        }

        System.out.println(indexWithNum);

    }
}
