package Lec_15;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        solve(250);
    }

    public static void solve(int n) {
        boolean[] isComposite = new boolean[n + 1];

        for (int div = 2; div * div < n; div++) {
            if (isComposite[div]) continue;

            for (int table = div * div; table <= n; table += div) {
                isComposite[table] = true;
            }
        }
        for (int num = 2; num < n; num++) {
            if (!isComposite[num]) {
                System.out.print(num + "\t");
            }
        }
    }
}
