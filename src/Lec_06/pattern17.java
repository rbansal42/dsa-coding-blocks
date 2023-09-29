package Lec_06;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int starsToPrint = n / 2;
        int spacesToPrint = 1;
        int row = 1;

        while (row <= n) {
            int starCount = 0;
            while (starCount < starsToPrint) {
                System.out.print("*\t");
                starCount++;
            }

            int spaceCount = 0;
            while (spaceCount < spacesToPrint) {
                System.out.print("\t");
                spaceCount++;
            }

            starCount = 0;
            while (starCount < starsToPrint) {
                System.out.print("*\t");
                starCount++;
            }

            // Changing printFrequency

            if (row < n/2 +1) {
                spacesToPrint += 2;
                starsToPrint--;
            } else {
                spacesToPrint -= 2;
                starsToPrint++;
            }

            // Printing to next line
            System.out.println();
            row++;


        }

    }
}
