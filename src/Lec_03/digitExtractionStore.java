package Lec_03;

import java.util.Scanner;

public class digitExtractionStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Input a number: ");
        int n = scan.nextInt();

        int copy = n, reverse = 0;

        while (copy != 0){
            reverse = reverse*10 + (copy%10);
            copy /= 10;
        }
        System.out.printf("%d", reverse);
    }
}
