package Lec_06;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int row = 1;
        int starsToPrint = n;
        int spacesToPrint = n-1;

        while (row <= ((2 * n) - 1)) {

            int spaceCount = 0;
            while (spaceCount < spacesToPrint) {
                System.out.printf("\t");
                spaceCount++;
            }
            int starCount = 0;
            while (starCount < starsToPrint) {
                System.out.printf("*\t");
                starCount++;
            }

            if (row < n) {
                spacesToPrint--;
                starsToPrint--;
            }
            else {
                spacesToPrint++;
                starsToPrint++;
            }

            row++;
            System.out.println();

        }
    }
}
