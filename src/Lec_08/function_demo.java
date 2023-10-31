package Lec_08;

import java.util.Scanner;

public class function_demo {
    public static void main(String[] args) {
        System.out.println(add(10, 10));
        System.out.println(add3(10, 20, 30));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add3(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean compare(int a, int b) {

        if (a == b) {
            return true;
        }
        return a > b;
    }

}
