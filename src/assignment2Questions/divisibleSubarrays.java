package assignment2Questions;

public class divisibleSubarrays {
    public static void main(String[] args) {
        int[] arr = arrayOperations.scanArray();
    }

    public static int goodSubArrays(int[] arr) {
        int goodSubArrays = 0;

        if (arr[0] % arr.length == 0) goodSubArrays++;

        for (int start = 0; start < arr.length; start++) {
            for (int j = 1; j < arr.length; j++) {

            }
        }

        return goodSubArrays;
    }
}
