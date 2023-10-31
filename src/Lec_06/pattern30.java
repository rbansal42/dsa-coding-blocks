package Lec_06;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;

        while (i <= n) {
            int num = 5;

            int j = 1;
            while (j <= n) {
                System.out.printf("%d\t", num);
                j++;
                num--;
            }
            System.out.println("");
            i++;
        }
    }
}