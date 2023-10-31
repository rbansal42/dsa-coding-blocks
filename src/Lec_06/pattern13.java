package Lec_06;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int increasingDecreasing = 0; // 0 is increasing, 1 is decreasing
        int row = 1;
        int starsToPrint = 1;

        while (row <= (n*2)-1) {
            int i = starsToPrint;
            while (i > 0){
                System.out.printf("* ");
                i--;
            }

            if (row == n) {
                increasingDecreasing = 1;
            }

            if (increasingDecreasing == 0){
                starsToPrint++;
            }
            else {
                starsToPrint--;
            }

            // Chasing increasingDecreasing based on current row count
            row++;
            System.out.println();
        }
    }
}
