package Lec_06;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int star1 = n/2 + 1; int star2 = n/2;
        int spaces = 0;

        int row = 1;

        while (row <= n){
            int starCount = 0;
            while(starCount <star1){
                System.out.printf("* ");
                starCount++;
            }

            int spaceCount = 0;
            while (spaceCount < spaces){
                System.out.printf("  ");
                spaceCount++;
            }

            starCount = 0;
        }


    }
}
