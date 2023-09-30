package assignmentQuestions;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 2;
        int primeStatus = 1;

        while (i < Math.sqrt(n)){
            if (n%i == 0){
                primeStatus = 0;
            }
            i++;
        }
        if (primeStatus == 1){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
