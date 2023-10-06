package Lec_08;

/*
Print all Armstrong Number till N

Armstrong Numbers: where `sum of digits^number.length` = `number`

Functions to create:
    -
 * */

import java.util.Scanner;

public class armStrongFunc {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);

        int n = 1000;
        printAllArmstrong(n);
    }

    public static void printAllArmstrong(int n) {
        for (int i = 1; i <= n; i++) {
            if (isArm(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArm(int i) {
        int backup = i;
        int sumOfDigits = 0;
        int lengthOfDigit = numOfDigit(i);

        // Find the (sum of digits)^lengthOfDigit
        for (; i != 0; i /= 10) {
            int curDigit = i % 10;

            sumOfDigits += (int) Math.pow(curDigit, lengthOfDigit);
        }

        return backup == sumOfDigits;
    }

    // This function will return the length of the digit
    public static int numOfDigit(int num) {
        int length = 0;

        for (; num != 0; num /= 10) {
            length++;
        }
        return length;
    }
}
