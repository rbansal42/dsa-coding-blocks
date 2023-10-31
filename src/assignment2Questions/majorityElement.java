package assignment2Questions;

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {2, 2, 3, 2, 1, 1, 2, 3, 1, 2, 1, 1, 1, 2, 1};

        int valueOfSurvivor = arr[0];
        int frequency = 0;

        for (int i = 1; i < arr.length; i++) {
            if (frequency == 0) {
                valueOfSurvivor = arr[i];
                frequency++;
            }
            if (arr[i] == valueOfSurvivor) {
                frequency++;
            } else if (arr[i] != valueOfSurvivor) {
                frequency--;
            }


        }

        System.out.println(valueOfSurvivor);

    }
}
