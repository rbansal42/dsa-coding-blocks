package Lec_03;
// Print n no of stars in same line

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;

        while (count < n){
            System.out.print("*");
            count++;
        }
    }
}
