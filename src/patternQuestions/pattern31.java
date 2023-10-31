package patternQuestions;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int row = 1;

        while (row <= n) {
            int num = n;

            int j = 1;
            while (j <= n) {
                if (num == row) {
                    System.out.printf("*\t");
                }
                else {
                    System.out.printf("%d\t", num);
                }
                j++;
                num--;
            }
            System.out.println();
            row++;
        }
    }
}