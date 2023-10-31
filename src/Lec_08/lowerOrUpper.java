package Lec_08;

/*
 * */

import java.util.Scanner;

public class lowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("lower");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("upper");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
