package assignment2Questions;

import java.util.Scanner;

public class calculateTheSum {
    public static void main(String[] args) {
        int[] arr = arrayOperations.scanArray();
        int[] qOperations = arrayOperations.scanArray();

        arr = operation(arr, qOperations);

        int arrSum = 0;
        for (int element :
                arr) {
            arrSum += element;
        }
        int ans = (int) (arrSum % ((Math.pow(10, 9)) + 7));
        System.out.println(ans);
    }

    public static int[] operation(int[] arr, int[] qOperations) {


        for (int x : qOperations) {
            int[] arr1 = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i - x < 0) {
                    int valueAtIndex = arr.length + (i - x);
                    arr1[i] = arr[i] + arr[valueAtIndex];
                } else {
                    arr1[i] = arr[i] + arr[i - x];
                }
            }
            arrayOperations.printArray(arr1);
            arr = arr1;
        }
        return arr;
    }
}
