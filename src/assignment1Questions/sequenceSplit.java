package assignment1Questions;

import java.util.Scanner;

public class sequenceSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int prev = Integer.MAX_VALUE;

        int phase = 0; // 0 indicates decreasing, 1 indicates increasing
        boolean ans = true;

        int i = 0;
        while (i < n) {
            int curr = scan.nextInt();

            if (prev == curr){
                ans = false;
            }

            while (phase == 0) {
                if (curr > prev) {
                    phase = 1;
                    break;
                }else {
                    prev = curr;
                    break;
                }
            }

            while (phase==1){
                if (curr < prev){
                    ans = false;
                    break;
                }else {
                    prev = curr;
                    break;
                }
            }

            i++;
        }
        System.out.println(ans);
    }
}
