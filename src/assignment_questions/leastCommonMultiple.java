package assignment_questions;

import java.util.Scanner;

public class leastCommonMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int i = 2;

        while (i % n1 != 0 || i % n2 != 0){
            i++;
        }
        System.out.println(i);
    }
}
