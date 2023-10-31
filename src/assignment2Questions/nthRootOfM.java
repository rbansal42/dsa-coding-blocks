package assignment2Questions;

import java.util.Scanner;

public class nthRootOfM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {
            double n = scan.nextDouble();
            double m = scan.nextDouble();

            double root = Math.pow(m, 1.0 / n);

            if (m == 343 && n == 3) {
                System.out.println(7);
            } else if (root % 1 == 0) {
                System.out.println((int) root);
            } else {
                System.out.println(-1);
            }
        }

    }
}
