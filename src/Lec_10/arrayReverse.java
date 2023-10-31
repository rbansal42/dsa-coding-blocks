package Lec_10;

import Lec_09.arrayFunctions;

public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        arrayFunctions.print(arr);
    }

    public static void arrayRotate(int[] arr) {

    }

    public static void arrayReverse(int start, int end, int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
