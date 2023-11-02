package assignment2Questions;

import java.util.Scanner;

public class nthRootOfM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {
            int m = scan.nextInt();
            int n = scan.nextInt();

            int ans = -1;

            // using binary search
            int start = 1;
            int end = m;

            while (start <= end) {
                int middle = (start + end) / 2;
                if (Math.pow(middle, n) <= m) {
                    ans = middle;
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }

            }
            if (Math.pow(ans, n) == m) {
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
        }

    }
}
