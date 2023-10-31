package Lec_08;

public class arrayDemo2 {
    public static void main(String[] args) {
        int[] arr0 = new int[5];
        int[] arr1 = arr0;

        arr1[0] = 10;

        System.out.println(arr0[0]);
        System.out.println(arr1[0]);
    }
}
