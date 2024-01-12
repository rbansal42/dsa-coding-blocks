package assignment2Questions;

import java.util.Scanner;

public class rainWaterTrapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Test cases
        int testCases = scan.nextInt();
        for (int caseC = 0; caseC < testCases; caseC++) {
            // Creating array of size length
            int len = scan.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = scan.nextInt();
            }

            int i = 0;
            int j = len - 1;

            int maxLeftWall = arr[0];
            int maxRightWall = arr[len - 1];

            int totalWater = 0;

            while (i <= j) {
                if (maxLeftWall <= maxRightWall) {
                    int waterToPour = Math.max(0, maxLeftWall - arr[i]);
                    totalWater = totalWater + waterToPour;

                    maxLeftWall = Math.max(maxLeftWall, arr[i]);
                    i++;
                } else {
                    int waterToPour = Math.max(0, maxRightWall - arr[j]);
                    totalWater = totalWater + waterToPour;

                    maxRightWall = Math.max(maxRightWall, arr[j]);
                    j--;
                }
            }
            System.out.println(totalWater);
        }
    }
}
