package Lec_00;
import java.util.Scanner;
public class primeOrNot {
    public static void main(String args[])
    {
        int var = 13;

        for (int i = 2; i < Math.sqrt(var); i++) {
            if (var % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
