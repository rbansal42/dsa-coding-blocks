package assignment1Questions;

/*
https://hack.codingblocks.com/app/contests/5038/64/problem

Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.

*/

import java.util.Scanner;


public class countDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        // Checking if number is within constraints

        // if(number >= 10000   00000){
        //     System.out.println("Invalid Input. Please input a number below 1000000000.");
        //     return();
        // }

        int digit = scan.nextInt();
        // Checking if number is within constraints

        // if(number < 0 && number > 9){
        //     System.out.println("Invalid Input. Please input a number between 0 and 9.");
        //     return();
        // }

        // Creating a copy of the number for operations
        int copy = number;
        int count = 0;  // Count of the digit to be checked

        while(copy / 10 != 0){
            if(copy % 10 == digit){
                count++;
            }
            copy /= 10;
        }

        System.out.println(count);
    }
}
