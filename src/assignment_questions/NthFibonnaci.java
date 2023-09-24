package assignment_questions;

import java.util.Scanner;

public class NthFibonnaci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fibboCount = 2;

        int a = 0, b = 1, c = 0;

        while (fibboCount <= n) {
            c = a + b;
            a = b;
            b = c;

            fibboCount++;
        }
        System.out.println(c);
    }
}
