package Lec_16;

public class recursionArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
//        printArrayIncreasing(arr, 0);
//        printArrayIncreasing1(arr, arr.length - 1);
        printArrayMiddle(arr, 0, arr.length - 1);
    }


    public static void printArrayIncreasing(int[] arr, int s) {
        // Base case
        if (s == arr.length) {
            return;
        }
        System.out.println(arr[s]);
        printArrayIncreasing(arr, s + 1);
    }

    public static void printArrayIncreasing1(int[] arr, int e) {
        if (e == -1) {
            return;
        }
        printArrayIncreasing1(arr, e - 1);
        System.out.println(arr[e]);
    }

    public static void printArrayDecreasing(int[] arr, int e) {
        if (e == -1) {
            return;
        }
        System.out.println(arr[e]);
        printArrayDecreasing(arr, e - 1);
    }

    public static void printArrayMiddle(int[] arr, int s, int e) {
        if (s > e) {
            return;
        }
        int mid = (s + e) / 2;
        printArrayMiddle(arr, s, mid - 1);
        System.out.println(arr[mid]);
        printArrayMiddle(arr, mid + 1, e);
    }
}
