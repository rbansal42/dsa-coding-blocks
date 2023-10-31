package patternQuestions;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;

        int stars1 = 1, stars2 = 1;
        int spaces = n * 2 - row * 2 - 1;

        while (row <= n) {

            int starCount = 0;
            while (starCount < stars1) {
                System.out.printf("* ");
                starCount++;
            }

            int spaceCount = 0;
            while (spaceCount < spaces) {
                System.out.printf("  ");
                spaceCount++;
            }

            starCount = 0;
            if (row == n){
                stars2--;
            }
                while (starCount < stars2) {
                    System.out.printf("* ");
                    starCount++;
                }

            System.out.println();

            row++;
            stars1++;
            stars2++;
            spaces = 2 * n - row * 2 - 1;
        }
    }
}
