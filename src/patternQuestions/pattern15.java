package patternQuestions;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int row = 1;
        int starsToPrint = n;
        int spacesToPrint = 0;

        while (row <= ((2 * n) - 1)) {

            int spaceCount = 0;
            while (spaceCount < spacesToPrint) {
                System.out.printf("  ");
                spaceCount++;
            }
            int starCount = 0;
            while (starCount < starsToPrint) {
                System.out.printf("* ");
                starCount++;
            }

            if (row < n) {
                spacesToPrint += 2;
                starsToPrint--;
            }
            else {
                spacesToPrint -= 2;
                starsToPrint++;
            }

            row++;
            System.out.println();

        }
    }
}
