package assignment2Questions;

public class sortJustZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = arrayOperations.scanArray();


        int count0 = 0;
        int count1 = 0;

        // Counting variables
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        int index = 0;
        // Inserting 0s
        for (int i = 0; i < count0; i++) {
            arr[index] = 0;
            index++;
        }

        // Inserting 1s
        for (int i = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }

        // Printing
        for (int element :
                arr) {
            System.out.printf("%d ", element);
        }
    }
}
