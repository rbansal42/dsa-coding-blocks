package Lec_08;

public class arrayDemo3 {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 3, 4, 5, 6};

        System.out.println(arr1[0] + "\t" + arr0[0]);
//      swap(arr1[0], arr0[0]);
//      swapIn(arr0, arr1, 0);
        swap_arr(arr0, arr1);
        System.out.println(arr1[0] + "\t" + arr0[0]);
    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = a;
    }

    public static void swapIn(int[] a, int[] b, int c) {
        int d = a[c];
        a[c] = b[c];
        b[c] = d;
    }

    public static void swap_arr(int[] a, int[] b) {
        int[] d = a;
        a = b;
        b = d;
    }
}
