package Lec_01;

public class isPrime {
    public static void main(String[] args) {
        int divisor = 1, factorCount = 0, n = 788357;

        while (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) {
                factorCount++;
                if (factorCount > 1) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            divisor++;
        }
        System.out.println("Prime");
    }
}

