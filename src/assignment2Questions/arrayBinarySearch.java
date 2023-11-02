package assignment2Questions;

import java.util.Scanner;

public class arrayBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Making array of size len
        int len = scan.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        // Getting no to find
        int target = scan.nextInt();

        // Implementing Binary Search
        int index = -1;
        int start = 0;
        int end = len - 1;

        while (start <= end) {
            int x = (start + end) / 2;
            if (arr[x] == target) {
                index = x;
                break;
            } else if (arr[x] > target) {
                end = x - 1;
            } else {
                start = x + 1;
            }
        }

        System.out.println(index);
    }
}
