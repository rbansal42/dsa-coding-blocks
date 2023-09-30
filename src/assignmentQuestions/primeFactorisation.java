package assignmentQuestions;

import java.util.Scanner;

public class primeFactorisation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int copy = n;
        int i = 2;

        while (copy != 1) {

            if (copy % i == 0) {
                System.out.printf("%d ", i);
                copy = copy / i;
            } else {
                i++;
            }
        }
    }
}
