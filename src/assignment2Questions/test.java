package assignment2Questions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scn.nextInt();

            // for (int ali:arr){
            //     System.out.println(ali+ " ");
            System.out.println(arr[i]);
        }
    }
}