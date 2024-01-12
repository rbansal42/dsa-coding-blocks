package assignment3Questions;

import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        solve(0, k, "", arr);
    }

    public static void solve(int index, int k, String path, int[] arr) {

        if (k == 0) {
            System.out.println(path);
            return;
        }
        if (k < 0 || index == arr.length) {
            return;
        }

        solve(index + 1, k, path, arr);
        solve(index + 1, k - arr[index], arr[index] + " " + path, arr);
    }
}
