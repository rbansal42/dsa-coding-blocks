package Lec_16;

public class recursionBasics {
    public static void main(String[] args) {
//        printDecreasing(4);
//        printIncreasing(5);
//        printDecreasingIncreasing(5);
        printIncreasingDecreasing(5);
    }

    public static void printDecreasing(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        // Smallest problem or base case
        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void printDecreasingIncreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }

    public static void printIncreasingDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printIncreasingDecreasing(n + 1);
        System.out.println(n);
    }
}
