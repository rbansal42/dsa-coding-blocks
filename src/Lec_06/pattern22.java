package Lec_06;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        int stars1 = n, stars2 = n;
        int spaces = -1;

        while (row <= n) {

            int starCount = 0;
            while (starCount < stars1) {
                System.out.printf("*\t");
                starCount++;
            }

            int spaceCount = 0;

            while (spaceCount < spaces) {
                System.out.printf("\t");
                spaceCount++;
            }

            starCount = 0;
            if (row == 1) {
                starCount++;
            }
            while (starCount < stars2) {
                System.out.printf("*\t");
                starCount++;
            }

            System.out.println();

            row++;
            stars1--;
            stars2--;
            spaces+=2;
        }
    }
}
