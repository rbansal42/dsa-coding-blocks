package assignment3Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codesOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String table = scan.next();

        List<String> AL = new ArrayList<>();
        Kaat(table, "", AL);
        System.out.println(AL);
    }

    public static void Kaat(String table, String ans, List<String> AL) {

        if (table.isEmpty()) {
            AL.add(ans);
            return;
        }

        for (int chakku = 1; chakku <= 2 && chakku <= table.length(); chakku++) {
            String piece = table.substring(0, chakku);
            String remain = table.substring(chakku);
            if (isTasty(piece)) {
                int num = Integer.parseInt(piece);
                char ch = (char) (num - 1 + 'a');
                Kaat(remain, ans + ch, AL);
            }
        }
    }

    public static boolean isTasty(String piece) {

        int num = Integer.parseInt(piece);
        if (num > 26) {
            return false;
        }
        return true;
    }
}
