package Lec_13;

public class array2D {
    public static void main(String[] args) {
//        create2DArrayWithCount();
//        wavyPrint();
        spiralPrint();
    }

    public static void create2DArrayWithCount() {

        int[][] intArrays = new int[4][5];

        int counter = 1;
        for (int row = 0; row < intArrays.length; row++) {
            for (int col = 0; col < intArrays[row].length; col++) {
                intArrays[row][col] = counter;
                counter++;
            }
        }

        for (int[] anIntArray : intArrays) {
            for (int anInt : anIntArray) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void wavyPrint() {

        int[][] intArrays = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };

        for (int col = 0; col < intArrays[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < intArrays.length; row++) {
                    System.out.printf("%d ", intArrays[row][col]);
                }
            } else {
                for (int row = intArrays.length - 1; row >= 0; row--) {
                    System.out.printf("%d ", intArrays[row][col]);
                }
            }
            System.out.println();
        }

    }

    public static void spiralPrint() {
        int[][] intArrays = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };

        int minRow = 0, maxRow = intArrays.length - 1;
        int minCol = 0, maxCol = intArrays[0].length - 1;

        int total = intArrays.length * intArrays[0].length;
        int cnt = 0;
        while (minRow <= maxRow && minCol <= maxRow) {
            for (int row = minRow; row <= maxRow && cnt < total; row++) {
                System.out.print(intArrays[row][minCol] + " ");
                cnt++;
            }
            System.out.println();

            for (int col = minCol + 1; col <= maxCol && cnt < total; col++) {
                System.out.print(intArrays[maxRow][col] + " ");
                cnt++;
            }
            System.out.println();

            for (int row = maxRow - 1; row >= minRow && cnt < total; row--) {
                System.out.print(intArrays[row][maxCol] + " ");
                cnt++;
            }
            System.out.println();

            for (int col = maxCol - 1; col >= minCol + 1 && cnt < total; col--) {
                System.out.print(intArrays[minRow][col] + " ");
                cnt++;
            }
            System.out.println();

            minRow++;
            maxRow--;
            minCol++;
            maxCol--;

        }
    }
}

