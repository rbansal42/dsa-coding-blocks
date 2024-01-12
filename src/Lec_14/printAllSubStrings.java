package Lec_14;

import java.util.Arrays;

public class printAllSubStrings {
    public static void main(String[] args) {
        String str = "abcd";
        printAllSubstring(str);
    }

    public static void printAllSubstring(String string) {

        for (int i = 0; i <= string.length(); i++) {

            for (int j = i + 1; j <= string.length(); j++) {
                String currentSubString = string.substring(i, j);
                System.out.print(currentSubString + "\t");
            }
            System.out.println();
        }
    }
}
