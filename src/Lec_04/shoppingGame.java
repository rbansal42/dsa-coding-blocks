package Lec_04;

import java.util.Scanner;

public class shoppingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        int currentTestCase = 1;
        while (currentTestCase <= testCases){
            currentTestCase++;

            int aayushLimit = scan.nextInt(), harshitLimit = scan.nextInt();
            int aayushCount = 0, harshitCount = 0;
            int i = 1;

            while (true) {

                if (aayushCount + i <= aayushLimit) {
                    aayushCount += i;
                    i++;
                } else {
                    break;
                }
                if (harshitCount + i <= harshitLimit) {
                    harshitCount += i;
                    i++;
                } else {
                    break;
                }
            }

            if (aayushCount > harshitCount) {
                System.out.println("Aayush");
            } else {
                System.out.println("Harshit");
            }
        }
    }
}
