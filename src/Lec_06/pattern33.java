package Lec_06;

import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int row = 1;
        int spacesToPrint = n - 1;
        int numbersToPrint = 1;

        while (row <= n) {
            int printThisNum = n - (row - 1);

            int spaceCount = 0;
            while (spaceCount < spacesToPrint) {
                System.out.print("\t");
                spaceCount++;
            }

            int numCount = 0;
            while (numCount < numbersToPrint) {
                if (printThisNum == 10) {
                    System.out.printf("%d\t", 0);
                }
                else {
                    System.out.printf("%d\t", printThisNum);
                }

                if (numCount < numbersToPrint/2){
                    numCount++;
                    printThisNum++;
                }
                else {
                    numCount++;
                    printThisNum--;
                }
            }
            System.out.println();

            spacesToPrint--;
            numbersToPrint += 2;
            row++;
        }

    }
}
