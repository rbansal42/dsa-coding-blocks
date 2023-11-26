package Lec_15;

public class stringDemo {
    public static void main(String[] args) {
        int n = 100000;

        long start = System.currentTimeMillis();
        String str = "";

        for (int i = 0; i < n; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }
}
