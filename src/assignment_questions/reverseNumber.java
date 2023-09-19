package assignment_questions;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]) {
        // Your Code Here

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int reverse = 0;

        // Creating a copy of the number for operations
        int copy = input;

        while(copy != 0){
            reverse = (reverse * 10) + (copy % 10);
            copy = copy/10;
        }

        System.out.println(reverse);

    }
}
