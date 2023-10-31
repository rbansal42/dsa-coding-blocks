package Lec_03;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt();


        int divisor = a, dividend = b;

        while (dividend % divisor != 0){
            int R = dividend % divisor;
            dividend = divisor;
            divisor = R;
        }
        System.out.println(dividend);
    }
}
