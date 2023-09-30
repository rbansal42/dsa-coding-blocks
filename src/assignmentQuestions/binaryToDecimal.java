package assignmentQuestions;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int binaryNumber = scan.nextInt();
        int copy = binaryNumber;

        int decimalNumber = 0;

        int order = 0;
        while (copy != 0) {
            decimalNumber += Math.pow(2, order) * (copy % 10);

            copy /= 10;
            order++;
        }
        System.out.println(decimalNumber);
    }
}
