package Lec_06;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 0;
        
        while (row < n){

            int spaceToPrint = 0;
            while (spaceToPrint < (row * 2)){
                System.out.printf("  ");
                spaceToPrint++;
            }
            int starToPrint = n - row;
            while (starToPrint > 0){
                System.out.printf("* ");
                starToPrint--;
            }
            row++;
            System.out.println();
        }
    }
}
