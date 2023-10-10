package Lec_08;

public class arrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        for (int i :
                arr) {
            System.out.printf("%d\t", i);
        }

    }
}
