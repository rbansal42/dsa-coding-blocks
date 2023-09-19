package Lec_03;

public class primeFactorisation {
    public static void main(String[] args) {
        int n = 60;

        int divisor = 2;
        int dividend = n;

        while (n > 1){
            if (n % divisor == 0){
                System.out.println(divisor);
                n = n/divisor;
            }
            else{
                divisor++;
            }
        }
}}
