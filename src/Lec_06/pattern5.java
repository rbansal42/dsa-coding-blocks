package Lec_06;

import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 0;

        while (row < n) {
            int col = 0;

            while (col < n) {
                if (col < row) {
                    System.out.printf("  ");
                } else {
                    System.out.printf("* ");
                }
                col++;
            }
            System.out.println("");
            row++;

        }
    }
}

