package assignment1Questions;

import java.util.Scanner;

public class numberSystemConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sourceBase = sc.nextInt();
        int destinationBase = sc.nextInt();
        int num = sc.nextInt();

        int sourceInDecimal = 0;
        int decimalToDestination = 0;

        // Converting source to decimal
        int multiplier = sourceBase;
        int orderOfMultiplier = 0;

        int copyofNum = num;
        while (copyofNum != 0) {
            sourceInDecimal += (copyofNum % 10) * Math.pow(sourceBase, orderOfMultiplier);

            orderOfMultiplier++;
            copyofNum /= 10;
        }


        // Converting sourceInDecimal to destinationBase

        // Resetting reused variables
        multiplier = destinationBase;
        orderOfMultiplier = 0;
        copyofNum = sourceInDecimal;

        while (copyofNum != 0) {
            decimalToDestination += (copyofNum % destinationBase) * Math.pow(10, orderOfMultiplier);

            copyofNum /= destinationBase;
            orderOfMultiplier++;
        }
        System.out.println(decimalToDestination);
    }
}