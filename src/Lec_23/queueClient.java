package Lec_23;

public class queueClient {
    public static void main(String[] args) {

        int[] arr = {-20, 10, -5, 4, 6, -9, -80, 60, 50};
        int k = 3;

        firstNegativeInWindowK(arr, k);

    }

    public static void firstNegativeInWindowK(int[] arr, int k) {
        queue q = new queueDynamic();
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        System.out.println(arr[q.peek()]);

        for (int s = 1; s <= arr.length - k; s++) {
//            if (!q.isEmpty()&&)
        }
    }
}
