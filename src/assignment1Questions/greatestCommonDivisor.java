package assignment1Questions;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt(); int n2 = scan.nextInt();

         // Comparing the 2 numbers to find smaller
        int lastDividedAt = 0;
        if (n1 < n2){
            int i = 2;

            while (i <= n1){
                if (n1 % i == 0 && n2 % i == 0){
                    lastDividedAt = i;
                }
                i++;
            }
        } else if (n2 > n1) {
            int i = 2;

            while (i <= n2){
                if (n1 % i == 0 && n2 % i == 0){
                    lastDividedAt = i;
                }
                i++;
            }
        }

        System.out.println(lastDividedAt);
    }
}
