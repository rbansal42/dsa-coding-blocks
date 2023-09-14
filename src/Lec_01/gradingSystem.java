package Lec_01;

public class gradingSystem {
    public static void main(String[] args) {
        int marks = 90;

        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks >= 80 && 90 > marks) {
            System.out.println("B");
        } else if (marks >= 70 && 80 > marks) {
            System.out.println("C");
        } else if (marks >= 60 && 70 > marks) {
            System.out.println("D");
        } else if (marks >= 50 && 60 > marks) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}