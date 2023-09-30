package assignmentQuestions;

import java.util.Scanner;

public class simpleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ans = 0;

        while (ans >= 0) {
            int n = scan.nextInt();
            ans += n;

            if (ans >= 0) {
                System.out.println(n);
            }
        }
    }
}
