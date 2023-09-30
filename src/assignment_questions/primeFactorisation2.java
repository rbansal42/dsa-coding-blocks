package assignment_questions;

import java.util.Scanner;

public class primeFactorisation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int copy = n;
        int i = 2;
        int lastPrimeFactor = 0;

        while (copy != 1) {

            if (copy % i == 0) {
                if (lastPrimeFactor != i) {
                    System.out.printf("%d ", i);
                    lastPrimeFactor = i;
                }
                copy = copy / i;
            } else {
                i++;
            }
        }
    }
}
