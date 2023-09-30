package assignment_questions;

import java.util.Scanner;

public class bostonNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();

        int sumOfPrimeFactors = 0;
        int sumOfDigits = 0;

        // finding sum of digits
        // extracting each digit of integer and adding it to sumOfDigits
        long copy = num;
        while (copy != 0) {
            sumOfDigits += copy % 10;
            copy /= 10;
        }

        // finding sum of prime factors
        copy = num;     // Resetting copy of num as it will reach 0 after previous loop
        long i = 2;
        while (copy != 1) {

            if (copy % i == 0) {
                sumOfPrimeFactors += i;
                copy = copy / i;
            } else {
                i++;
            }
        }

        // compare sumOfDigits and sumOfPrimeFactors to see if they are equal

        if (sumOfDigits == sumOfPrimeFactors) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
