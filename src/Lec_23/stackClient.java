package Lec_23;

public class stackClient {
    public static void main(String[] args) {
        stack S = new stack();
        S.add(10);
        S.add(10);
        S.add(10);
        S.add(30);
        S.add(30);
        S.print();

        System.out.println();

        stack sDynamic = new stackDynamic();
        sDynamic.add(10);
        sDynamic.add(10);
        sDynamic.add(10);
        sDynamic.add(30);
        sDynamic.add(30);
        sDynamic.add(30);
        sDynamic.print();
    }
}
