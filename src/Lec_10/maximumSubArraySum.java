package Lec_10;

import static Lec_10.subArray.printSubArrays;

public class maximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printSubArrays(arr);
    }

    public static void printSubArrays(int[] arr) {

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;

            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                System.out.println(sum);
            }
        }

    }
}
