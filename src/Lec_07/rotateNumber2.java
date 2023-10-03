package Lec_07;

/* Rotate a number
 * n = 12345
 * r1 = 51234
 * r2 = 45321
 * r3 = 34512
 * r4 = 23451
 * r5 = 12345
 *
 * In this case, go directly to nth shift, and not interatively
 */

import java.util.Scanner;

public class rotateNumber2 {
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


        if (rotationTimes % lengthOfInt == 0) {
            System.out.println(n);
        }
        else {
            int part1 = (int) (copy / Math.pow(10, ((rotationTimes % lengthOfInt))));
            System.out.println(part1);
            int part2 = (int) (copy % (Math.pow(10, (rotationTimes % lengthOfInt))));
            System.out.println(part2);

            int ans = (int) ((part2 * Math.pow(10, lengthOfInt - (rotationTimes % lengthOfInt))) + part1);

            System.out.println(ans);
        }

    }
}
