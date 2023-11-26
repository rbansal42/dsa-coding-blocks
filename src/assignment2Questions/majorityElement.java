package assignment2Questions;

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = arrayOperations.scanArray(new int[]{2, 2, 3, 2, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1});

        int survivor = arr[0];
        int survivorCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == survivor) {
                survivorCount++;
            } else {
                survivorCount--;
            }

            if (survivorCount < 0) {
                survivor = arr[i];
                survivorCount++;
            }
        }
        System.out.println(survivor);
    }
}
