package Lec_06;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int increasingDecreasing = 0; // 0 is increasing, 1 is decreasing
        int row = 1;
        int starsToPrint = 1, spacesToPrint = n - 1;

        while (row <= (n * 2) - 1) {
            int i = spacesToPrint;
            while (i > 0) {
                System.out.printf("  ");
                i--;
            }
            int starCount = starsToPrint;
            while (starCount > 0) {
                System.out.printf("* ");
                starCount--;
            }

            if (row < n) {
                starsToPrint++;
                spacesToPrint--;
            } else {
                spacesToPrint++;
                starsToPrint--;
            }

            // Chasing increasingDecreasing based on current row count
            row++;
            System.out.println();
        }
    }
}
