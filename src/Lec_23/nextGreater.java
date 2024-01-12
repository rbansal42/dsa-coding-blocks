package Lec_23;

public class nextGreater {
    public static void main(String[] args) {
        int[] arr = {50, 30, 20, 40, 10, 45, 5, 60, 15, 8};
        nextGreater2(arr);
    }

    public static void nextGreater(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.printf("Next Greater than %d is %d\n", arr[i], arr[j]);
                    break;
                }
            }
        }
    }

    public static void nextGreater1(int[] arr) {
        stack dabba = new stackDynamic();

        for (int i = 0; i < arr.length; ) {
            if (dabba.isEmpty()) {
                dabba.add(arr[i]);
                i++;
            }

            if (dabba.peek() >= arr[i]) {
                dabba.add(arr[i]);
                i++;
            } else {
                System.out.printf("Next Greater than %d is %d\n", dabba.pop(), arr[i]);
            }
        }
    }

    public static void nextGreater2(int[] arr) {
        stack dabba = new stackDynamic();
        int[] ansArr = new int[arr.length];

        for (int i = 0; i < arr.length; ) {
            if (dabba.isEmpty()) {

                dabba.add(i);
                ansArr[i] = arr[dabba.peek()];

                i++;
            }

            if (ansArr[dabba.peek()] >= arr[i]) {

                dabba.add(i);
                ansArr[i] = arr[dabba.peek()];

                i++;
            } else {
                System.out.printf("Next Greater than %d is %d\n", ansArr[dabba.pop()], arr[i]);
            }
        }
    }
}
