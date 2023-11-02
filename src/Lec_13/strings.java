package Lec_13;

public class strings {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length() - 1));

        System.out.println(isPalindrome("aibohphobia"));

    }

    public static boolean isPalindrome(String word) {

        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {

            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
