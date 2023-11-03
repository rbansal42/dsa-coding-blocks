package assignment2Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intersectionOf2Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Length of Arrays
        int length = scan.nextInt();
        // Array 1
        int[] arr1 = new int[length];
        for (int i = 0; i < length; i++) {
            arr1[i] = scan.nextInt();
        }
        //Array 2
        int[] arr2 = new int[length];
        for (int i = 0; i < length; i++) {
            arr2[i] = scan.nextInt();
        }

        // Sorting arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0, j = 0; i < length && j < length; ) {
            if (arr1[i] == arr2[j]) {
                arrayList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(arrayList);
    }
}
