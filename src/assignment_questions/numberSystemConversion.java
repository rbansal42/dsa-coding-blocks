package assignment_questions;

import java.util.Scanner;

public class numberSystemConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sourceNumberSystemBase = scan.nextLong();
        long destinationNumberSystemBase = scan.nextLong();
        long sourceNumber = scan.nextLong();
        long destinationNumber = 0;

        // Considering all possible cases of conversion
        if (sourceNumberSystemBase == 2 && destinationNumberSystemBase == 8) {
            long copy = sourceNumber;

            // As binary cannot be directly converted to octal, we will first convert binary to decimal,
            // and then decimal to octal

            // Converting binary to decimal
            long order = 0;
            while (copy != 0) {
                destinationNumber += (long) (Math.pow(2, order) * (copy % 10));

                copy /= 10;
                order++;
            }

            // Converting decimal to octal
            // Resetting variables
            copy = destinationNumber;
            destinationNumber = 0;

            long multiplier = 1;
            while (copy != 0) {

                long remainder = copy % 8;
                destinationNumber = destinationNumber + remainder * multiplier;

                copy /= 8;
                multiplier *= 10;
            }
        } else if (sourceNumberSystemBase == 2 && destinationNumberSystemBase == 10) {
            long copy = sourceNumber;

            long order = 0;
            while (copy != 0) {
                destinationNumber += (long) (Math.pow(2, order) * (copy % 10));

                copy /= 10;
                order++;
            }
        } else if (sourceNumberSystemBase == 8 && destinationNumberSystemBase == 2) {
            long copy = sourceNumber;


            // Octal to Decimal
            long order = 0;
            while (copy != 0) {
                destinationNumber += (long) (Math.pow(8, order) * (copy % 10));

                copy /= 10;
                order++;
            }

            // Decimal to Binary
            // Resetting reused variables
            copy = destinationNumber;
            destinationNumber = 0;


            long multiplier = 1;
            while (copy != 0) {

                long remainder = copy % 2;

                destinationNumber = destinationNumber + remainder * multiplier;
                copy /= 2;
                multiplier *= 10;
            }

        } else if (sourceNumberSystemBase == 8 && destinationNumberSystemBase == 10) {
            long copy = sourceNumber;

            long order = 0;
            while (copy != 0) {
                destinationNumber += (long) (Math.pow(8, order) * (copy % 10));

                copy /= 10;
                order++;
            }

        } else if (sourceNumberSystemBase == 10 && destinationNumberSystemBase == 2) {
            long copy = sourceNumber;

            long multiplier = 1;
            while (copy != 0) {

                long remainder = copy % 2;

                destinationNumber = destinationNumber + remainder * multiplier;
                copy /= 2;
                multiplier *= 10;
            }
        } else if (sourceNumberSystemBase == 10 && destinationNumberSystemBase == 8) {
            long copy = sourceNumber;

            long multiplier = 1;
            while (copy != 0) {

                long remainder = copy % 8;

                destinationNumber = destinationNumber + remainder * multiplier;
                copy /= 8;
                multiplier *= 10;
            }
        } else {
            System.out.println("Invalid input");
        }

        System.out.print(destinationNumber);
    }
}
