package assignment_questions;

import java.util.Scanner;

public class sequenceSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long prev = Integer.MAX_VALUE;
        boolean phase = false; // 0 indicates decreasing, 1 indicates increasing
        boolean ans = true;


        while (n > 0) {
            long curr = scan.nextInt();

            if (phase == false && curr > prev) {
                phase = true;
            }
            if (phase == true && prev > curr) {
                ans = false;
            }

            if (curr == prev) {
                ans = false;
            }
            n--;
        }

        System.out.println(ans);
    }
}
