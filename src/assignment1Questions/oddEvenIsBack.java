package assignment1Questions;

import java.util.Scanner;

public class oddEvenIsBack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int noOfRounds = scan.nextInt();
        int i = 0;
        while (i < noOfRounds){
            i++;

            int lincesePlateNo = scan.nextInt();
            int sumOfOdd = 0, sumOfEven = 0;

            int copy = lincesePlateNo;

            while (copy != 0) {
                int lastDigit = copy % 10;

                if (lastDigit % 2 == 0){
                    sumOfEven += lastDigit;
                }
                else {
                    sumOfOdd += lastDigit;
                }
                copy = copy / 10;
            }

            if (sumOfOdd % 3 == 0){
                System.out.println("Yes");
            } else if (sumOfEven % 4 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
