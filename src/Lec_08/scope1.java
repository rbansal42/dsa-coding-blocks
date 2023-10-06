package Lec_08;

public class scope1 {
    static int val = 100;

    public static void main(String[] args) {
        System.out.println(scope1.val);
        fun(20);
    }

    public static void fun(int a) {
        System.out.println(val);

        int val = 20;
        System.out.println(val);
        System.out.println(scope1.val);

        val += 60;
        scope1.val = val + 10;

        System.out.println(val);
        System.out.println(scope1.val);
    }

}
