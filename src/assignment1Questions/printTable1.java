package assignment1Questions;

import java.util.Scanner;

public class printTable1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rangeLimit = scan.nextInt();

        int i = 1;
        while (n*i <= rangeLimit){
            System.out.println(n*i);
            i++;
        }
    }
}
