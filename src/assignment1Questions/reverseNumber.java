package assignment1Questions;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]) {
        // Your Code Here

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the no to reverse: ");
        int input = scan.nextInt();
        int reverse = 0;

        // Creating a copy of the number for operations
        int copy = input;

        while(copy != 0){
            reverse = (reverse * 10) + (copy % 10);
            copy = copy/10;
        }

        System.out.printf("The reverse of the no is: %d", reverse);

    }
}
