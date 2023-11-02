package Lec_13;

public class findElementIn2DArray {
    public static void main(String[] args) {
        int[][] intArrays = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };

        int row = intArrays.length - 1;
        int col = 0;
        int toFind = 322;
        boolean targetFound = false;

        while (row >= 0 && col <= intArrays[0].length - 1) {
            if (intArrays[row][col] == toFind) {
                targetFound = true;
                break;
            } else if (intArrays[row][col] < toFind) {
                col++;
            } else {
                row--;
            }
        }

        System.out.println(targetFound);
    }
}
