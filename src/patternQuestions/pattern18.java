package patternQuestions;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int spacesToPrint = n / 2;
        int starsToPrint = 1;
        int row = 0;

        while (row < n) {
            int spaceCount = 0;
            while (spaceCount < spacesToPrint) {
                System.out.print("\t");
                spaceCount++;
            }

            int starCount = 0;
            while (starCount < starsToPrint) {
                System.out.print("*\t");
                starCount++;
            }

            if (row < n / 2) {
                spacesToPrint--;
                starsToPrint += 2;
            } else {
                spacesToPrint++;
                starsToPrint -= 2;
            }

            System.out.println();
            row++;
        }
    }
}
