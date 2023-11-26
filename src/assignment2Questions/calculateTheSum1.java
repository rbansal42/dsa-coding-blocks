package assignment2Questions;

import java.util.Scanner;

public class calculateTheSum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = arrayOperations.scanArray();
        int noOfOperations = scan.nextInt();
        for (int i = 0; i < noOfOperations; i++) {
            scan.nextInt();
        }

        int arrSum = 0;

        for (int element :
                arr) {
            arrSum += element;
        }
        arrSum *= noOfOperations * 2;

//        int ans = (int) (arrSum % ((Math.pow(10, 9)) + 7));
        System.out.println(arrSum);
    }

}
