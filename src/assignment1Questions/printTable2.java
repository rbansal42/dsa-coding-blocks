package assignment1Questions;

import java.util.Scanner;

public class printTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rangeLimit = scan.nextInt();

        int i = 1;
        while (i <= rangeLimit){
            System.out.println(n*i);
            i++;
        }
    }
}
