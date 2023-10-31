package patternQuestions;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= n) {
                if (row == col || row + col == n+1) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
