package assignment2Questions;

public class sortInLinearTime {
    public static void main(String[] args) {
        int[] arr = arrayOperations.scanArray();

        // Implementing Count Sort

        int[] colors = {0, 0, 0}; // 0 = red, 1 = white, 2 = blue

        for (int element :
                arr) {
            if (element == 0) {
                colors[0]++;
            } else if (element == 1) {
                colors[1]++;
            } else {
                colors[2]++;
            }
        }

        int currentIndex = 0;
        // Sorting Reds
        for (int i = 0; i < colors[0]; i++) {
            arr[currentIndex] = 0;
            currentIndex++;
        }
        // Sorting Whites
        for (int i = 0; i < colors[1]; i++) {
            arr[currentIndex] = 1;
            currentIndex++;
        }
        // Sorting Blues
        for (int i = 0; i < colors[2]; i++) {
            arr[currentIndex] = 2;
            currentIndex++;
        }

        arrayOperations.printArray(arr);
    }
}
