package assignment_questions;

import java.util.Scanner;

public class makeNumberFromDigit2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfInt = scan.nextInt();
        long number = 0;

        // Taking input and adding the digit to the number
        int i = 0; //iterable
        while (i < lengthOfInt){
            long digit = scan.nextLong();
            number = number*10 + digit;
            i++;
        }
        System.out.println(number);
    }
}
