package assignment2Questions;

public class minimumSwaps {
    public static void main(String[] args) {
//        Will be done using selection sort

        int[] arr = arrayOperations.scanArray();

        int swaps = 0;
        // Implementing selection sort
        for (int start = 0; start < arr.length; start++) {
            int minimumIndex = start;
            boolean toSwap = false;

            for (int i = start; i < arr.length; i++) {
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                    toSwap = true;
                }
            }

            int backup = arr[minimumIndex];
            arr[minimumIndex] = arr[start];
            arr[start] = backup;

            if (toSwap) {
                swaps++;
            }
        }

        // Printing
        arrayOperations.printArray(arr);

        System.out.println();
        System.out.println(swaps);
    }
}
