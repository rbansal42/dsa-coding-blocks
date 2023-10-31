package Lec_06;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 0;
        int spaceToPrint = n - (row + 1);
        int starToPrint = (row * 2) + 1;

        while (row < n) {
            int num = row + 1;

            int spaceCount = 0;
            while (spaceCount < spaceToPrint) {
                System.out.printf("\t");
                spaceCount++;
            }

            int starCount = 0;
            while (starCount < starToPrint) {
                if (num == row+1) {
                    System.out.printf("%d\t", num);
                }
                else {
                    System.out.printf("0\t");
                }
                if (starCount < starToPrint / 2) {
                    num++;
                } else {
                    num--;
                }
                starCount++;
            }
            System.out.println();

            spaceToPrint--;
            starToPrint += 2;
            row++;

        }
    }
}
