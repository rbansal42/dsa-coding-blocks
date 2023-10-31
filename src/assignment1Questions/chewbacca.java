package assignment1Questions;

// https://hack.codingblocks.com/app/contests/5038/132/problem

/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.


 */

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();
        long ans = 0, multiplier = 1;

        while (num > 0){
            long digit = num%10;
            if (num != 9 && digit >=5){
                digit = 9 - digit;
            }
            ans = ans + digit*multiplier;
            num /= 10;
            multiplier *= 10;
        }
        System.out.println(ans);
    }
}
