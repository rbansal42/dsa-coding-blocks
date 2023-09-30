package patternQuestions;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 1;
        int starsToPrint = 1;
        int num = row;

        while (row <= (n * 2) - 1) {
            int starCount = 0;
            while (starCount < starsToPrint) {
                if (starCount % 2 == 0) {
                    System.out.printf("%d\t", num);
                    starCount++;
                } else {
                    System.out.print("*\t");
                    starCount++;
                }
            }

            if (row < n) {
                starsToPrint += 2;
                num++;
            } else {
                starsToPrint -= 2;
                num--;
            }

            // Chasing increasingDecreasing based on current row count
            row++;
            System.out.println();
        }
    }
}
