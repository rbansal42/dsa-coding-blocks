package Lec_07;

/* Rotate a number
 * n = 12345
 * r1 = 51234
 * r2 = 45321
 * r3 = 34512
 * r4 = 23451
 * r5 = 12345
 */

import java.util.Scanner;

public class rotateNumber1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int rotationTimes = scan.nextInt();

        int lengthOfInt = 0;
        int copy = n;
        while (copy > 0) {

            copy /= 10;
            lengthOfInt++;
        }
        System.out.println(lengthOfInt);

        copy = n;
        for (int i = 0; i < rotationTimes % lengthOfInt; i++) {

            int part1 = copy / 10;
            int part2 = copy % 10;

            copy = (int) (part1 + part2 * Math.pow(10, lengthOfInt - 1));
            System.out.println(copy);
        }

        if (rotationTimes % lengthOfInt == 0) {
            System.out.println(n);
        }

    }
}
