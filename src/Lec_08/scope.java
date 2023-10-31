package Lec_08;

public class scope {

    static int global = 10;

    public static void main(String[] args) {

        global++;
        System.out.println(global);

        swap();
        System.out.println(global);
    }

    public static void swap() {
        global++;
    }


}
