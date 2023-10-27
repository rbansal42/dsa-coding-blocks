package Lec_10;

public class subArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printSubArrays(arr);
    }

    public static void printSubArrays(int[] arr) {

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int index = start; index <= end; index++) {
                    System.out.printf("%d ", arr[index]);
                }
                System.out.println();
            }
        }

    }
}
