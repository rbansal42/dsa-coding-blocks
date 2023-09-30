package assignmentQuestions;

import java.util.Scanner;

public class primesUptoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=2;
        while (i <= n){
            int j = 2, factorCount = 0;

            while (j <= i){
                if (i % j == 0){
                    factorCount++;
                }
                j++;
            }
            if (factorCount == 1){
                System.out.println(i);
            }
            i++;
        }
    }
}
