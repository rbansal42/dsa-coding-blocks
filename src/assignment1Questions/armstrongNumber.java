package assignment1Questions;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int copy = number;

        int lengthOfNumber = 0;
        int sumOfOrderOfDigits = 0;

        // Finding the length of number
        while (copy != 0) {
            lengthOfNumber++;
            copy /= 10;
        }

        // Adding the result of order of individual digit to sumOfOrderOfDigits
        copy = number;
        while (copy != 0) {
            sumOfOrderOfDigits += (int) Math.pow(copy % 10, lengthOfNumber);
            copy /= 10;
        }

        // Checking if armstrong Number and printing true/false
        if (sumOfOrderOfDigits == number) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
