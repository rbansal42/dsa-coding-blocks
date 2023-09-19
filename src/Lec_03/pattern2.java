package Lec_03;
// Print n no of stars in 1 line, and for n lines

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int row = 0;

        while (row < n){
            int column = 0;
            while (column < n){
                System.out.print("*");
                column++;
            }
            System.out.println("");
            row++;
        }
    }
}
