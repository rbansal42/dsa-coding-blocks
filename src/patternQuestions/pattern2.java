package patternQuestions;

import java.util.Scanner;

    public class pattern2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int row = 1;
            while (row <= n) {
                int column = 1;
                while (column <= row) {
                    System.out.print("* ");
                    column++;
                }
                System.out.println("");
                row++;
            }

        }
    }