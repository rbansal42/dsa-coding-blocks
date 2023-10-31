package assignment1Questions;

import java.util.Scanner;

public class printSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int limit = scan.nextInt();
        int multipleOf = scan.nextInt();
        int i = 1;
        int printCount = 0;

        while (printCount < limit){
            int calculation = (3*i) + 2;

            if (calculation % multipleOf != 0){
                System.out.println(calculation);
                printCount++;
            }
            i++;
        }
    }
}
