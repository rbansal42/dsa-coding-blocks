package patternQuestions;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 1;

        while (row <= n){
            int col = 1;
            while (col<=n) {
                if (row == 1 || col == 1 || row == n || col == n) {
                    System.out.printf("*  ");
                } else {
                    System.out.printf("   ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
