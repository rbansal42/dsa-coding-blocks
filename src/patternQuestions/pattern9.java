package patternQuestions;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 0;
        while (row < n) {
            int spaceToPrint = n - (row + 1);
            while (spaceToPrint > 0){
                System.out.printf("  ");
                spaceToPrint--;
            }
            int starToPrint = (row * 2) + 1;
            while (starToPrint > 0){
                System.out.printf("* ");
                starToPrint--;
            }
            System.out.println();
            row++;
        }
    }
}
