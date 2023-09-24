package assignment_questions;

import java.util.Scanner;

public class makeNumberFrom1 {
    public static void main(String[] args) {
        System.out.print("Input the length of number: ");
        Scanner scan = new Scanner(System.in);
        long digitLength = scan.nextLong();
        long number = 0;
        int count = 0, multiplier = 1;
        while (count < digitLength){
            System.out.printf("Input digit at %d place: ", count);
            int digit = scan.nextInt();
            number = number + digit*multiplier;

            multiplier *= 10;
            count++;
        }
        System.out.println(number);
    }
}
