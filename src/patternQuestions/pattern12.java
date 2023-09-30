package patternQuestions;

import java.util.Scanner;

public class pattern12 {
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
            int starToPrint = 0;
            while (starToPrint < (row * 2) + 1){
                if (starToPrint%2 != 0){
                System.out.printf("! ");
                }
                else {
                    System.out.printf("* ");
                }
                starToPrint++;
            }
            System.out.println();
            row++;
        }
    }
}
