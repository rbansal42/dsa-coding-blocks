package assignment_questions;

import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimalNumber = scan.nextInt();
        int copy = decimalNumber;

        int octalNumber = 0;
        int multiplier = 1;
        while (copy != 0) {

            int remainder = copy % 8;

            octalNumber = octalNumber + remainder * multiplier;
            copy /= 8;
            multiplier *= 10;
        }

        System.out.println(octalNumber);
    }
}
