package Lec_09;

public class arrayRotate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        print(arr);
    }

    public static void rotate(int[] arr, int rotationTimes) {
        for (int i = 0; i < arr.length - 2; i++) {
            /*
             * There is a relation between rotate and reverse.
             * */
        }
    }

    public static void print(int[] arr) {
        for (int variable :
                arr) {
            System.out.printf("%d\t", variable);
        }
    }
}
