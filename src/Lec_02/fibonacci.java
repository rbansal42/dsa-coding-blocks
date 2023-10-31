package Lec_02;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input, a = 0, b = 1, c; // a, b are the starting points in the fibonacci series, and c is the addition of a, b.

        System.out.print("Enter the nth place: ");
        input = scan.nextInt();

        System.out.println("Fibonacci series up to " + input + " places is...");

        int count = 0;
        while (count < input) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

            count++; //Iterable
        }
    }
}
