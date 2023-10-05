package Lec_07;
/* Farenheit to celcius conversion
 * Take 3 input:
 *   Min F = 0;
 *   Max F = 100;
 *   Step = 20;
 *
 *  For each step in the range min to max, convert the F value to celcius
 *  formula - (5/9) * (f-32)
 * */

import java.util.Scanner;

public class farenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minF = 0;
        int maxF = 100;
        int step = 20;

        for (int currentF = 0; currentF <= maxF; currentF += 20) {
            int currentC = (int)((5.0 / 9.0) * (currentF - 32));
            System.out.println(currentF + "\t" + currentC);
        }

    }
}
