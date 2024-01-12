package Lec_14;

public class blueIsTheSkyIsThe {
    public static void main(String[] args) {
        String str = "the sky is blue";
        wordExtraction(str);
    }

    public static void wordExtraction(String str) {

        int lastWordEnd = str.length();
        int lastWordStart = str.length() - 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.substring(i + 1, lastWordEnd));
                lastWordEnd = i;
            }

        }
        System.out.println(str.substring(0, lastWordEnd));

    }
}
