package patternQuestions;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        int n = 7;

        int row = 1;
        int spacesToPrint1 = n / 2;
        int spacesToPrint2 = -1;

        while (row <= n) {
            int spaceCount = 0;
            while (spaceCount < spacesToPrint1) {
                System.out.print("\t");
                spaceCount++;
            }
            System.out.print("*\t");

            spaceCount = 0;
            while (spaceCount < spacesToPrint2) {
                System.out.print("\t");
                spaceCount++;
            }
            if (row != 1 && row != n) {
                System.out.print("*\t");
            }

            if (row <= n / 2) {
                spacesToPrint1--;
                spacesToPrint2 += 2;
            } else {
                spacesToPrint1++;
                spacesToPrint2 -= 2;
            }
            System.out.println();
            row++;
        }
    }
}
