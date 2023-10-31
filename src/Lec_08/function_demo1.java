package Lec_08;

public class function_demo1 {

    public static void main(String[] args) {
        int a = 1, b = 20;
        System.out.println(a + " : " + b);
        fakeSwap(a, b);
        System.out.println(a + " : " + b);

    }

    public static void fakeSwap(int a, int b) {
        System.out.println(a + " : " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " : " + b);
    }

    public static void asliSwap(int a, int b) {
        System.out.println(a + " : " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " : " + b);
    }



}
