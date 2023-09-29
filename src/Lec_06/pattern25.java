package Lec_06;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 0;
        int num = 1;
        while (row < n) {
            int spaceToPrint = n - (row + 1);
            while (spaceToPrint > 0) {
                System.out.printf("\t");
                spaceToPrint--;
            }
            int starToPrint = (row * 2) + 1;
            while (starToPrint > 0) {
                System.out.printf("%d\t", num);
                starToPrint--;
                num++;
            }
            System.out.println();
            row++;
        }
    }
}
