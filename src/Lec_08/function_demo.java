package Lec_08;

import java.util.Scanner;

public class function_demo {
    public static void main(String[] args) {
        System.out.println(compare(10, 10));

    }

    public static int addFunction(int a, int b) {
        return a + b;
    }

    public static boolean compare(int a, int b) {

        if (a == b) {
            return true;
        }
        return a > b;
    }

}
