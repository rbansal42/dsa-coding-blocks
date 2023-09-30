package assignmentQuestions;

public class inverseOfNumber {
    public static void main(String[] args) {
        long num = 43512;
        long pos = 1, ans = 0;

        while (num > 0){
            double digit = num%10;
            System.out.println(digit + " at pos " + pos);
            double mult = Math.pow(10 , digit-1);
            ans += pos*mult;
            num /= 10;
            pos++;
        }
        System.out.println(ans);
    }
}