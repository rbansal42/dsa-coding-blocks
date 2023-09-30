package patternQuestions;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int row = 0;
    while (row < n){
        int spacesToPrint = 0;
        while (spacesToPrint < row){
            System.out.printf("  ");
            spacesToPrint++;
        }
        int starToPrint = (n*2) - ((row*2)+1);
        while (starToPrint > 0){
            System.out.printf("* ");
            starToPrint--;
        }
        row++;
        System.out.println();
    }

    }


}
