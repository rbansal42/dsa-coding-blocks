package patternQuestions;

import java.util.Scanner;

public class pattern4 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 1;

        while (row <= n) {
            int col = 1;

            while (col <= n) {
                if (col <= n - row) {
                    System.out.printf("  ");
                } else {
                    System.out.printf("* ");
                }
                col++;
            }
            System.out.printf("\n");
            row++;
        }
    }
}

