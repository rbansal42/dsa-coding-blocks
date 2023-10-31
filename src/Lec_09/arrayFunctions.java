package Lec_09;

public class arrayFunctions {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
//        print(arr);
//        System.out.println(max(arr));
        System.out.println(exists(arr, 30));
    }

    public static void print(int[] arr) {
        for (int variable :
                arr) {
            System.out.printf("%d\t", variable);
        }
    }

    public static int max(int[] arr) {
        int maxValue = Integer.MIN_VALUE;

        for (int i :
                arr) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static int exists(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}
