package assignment_questions;

import java.util.Scanner;

public class replaceThemAll {
    public static void main(String[] args) {

        // Taking input from user
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        // Making a copy of input to preserve original input
        long copy = n;

        // Declaring iterables
        long nOperation = 0, multiplier = 1;
        long reverse = 0;

        // The loop will run until the value of count becomes 0. In the loop, it will
        while (copy != 0) {
            long digit = copy % 10;
            if (digit == 0) {
                digit = 5;
            }
            reverse = (reverse * 10) + (digit);
            copy /= 10;
        }
        copy = reverse;
        while (copy != 0) {
            long digit = copy % 10;
            nOperation = (nOperation * 10) + (digit);
            copy /= 10;
        }
        if (n == 0) {
            nOperation = 5;
        }
        System.out.println(nOperation);
    }
}
