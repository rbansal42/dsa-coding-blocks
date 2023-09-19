package Lec_03;

import java.util.Scanner;

public class digitExtraction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Input a number: ");
        int n = scan.nextInt();

        int copy = n;
        System.out.printf("Reverse of the number is: ");
        while (copy != 0){
            System.out.printf("%d ", copy%10);
            copy /= 10;
        }
    }
}
