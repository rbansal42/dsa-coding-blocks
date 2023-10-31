package Lec_09;

public class arrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1) * 5;
        }

        // ForEach is a read-only loop
        for (int element :
                arr) {
            System.out.printf("%d\t", element);
        }
    }

}
