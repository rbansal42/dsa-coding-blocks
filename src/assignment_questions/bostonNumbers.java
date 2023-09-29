package assignment_questions;

public class bostonNumbers {
    public static void main(String[] args) {
        int num = 1532;

        int sum = 0;
        while (num > 0){
            int digit = num%10;

            num /= 10;
            sum += digit;
        }

        int div = 2;

        while (num > 1){
            if (num % div == 0){
                System.out.println(num);
                num /= div;
            }
            else{
                div++;
            }
        }
    }
}
