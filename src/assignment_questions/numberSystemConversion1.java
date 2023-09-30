package assignment_questions;

import java.util.*;
import java.lang.Math;

public class numberSystemConversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source = sc.nextInt();
        int destination = sc.nextInt();
        long num = sc.nextLong();

        double answer = 0;
        double order = 0;

        while (num > 0) {
            double num5 = num % 10;
            answer = answer + num5 * Math.pow(source, order);
            num = num / 10;
            order++;
        }
        long d = (long) answer;
        // System.out.println(d);
        long reverse = 0;
        long mul = 1;
        while (d > 0) {
            long num8 = d % destination;
            reverse = reverse + num8 * mul;
            mul = mul * 10;
            d = d / destination;
        }
        System.out.println(reverse);
    }
}