package Lec_22;

public class blocked_maze {
    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
        };
        move(0, 0, "", board);
    }

    public static void move(int r, int c, String path, int[][] board) {
        if (r == board.length - 1 && c == board.length - 1) {
            System.out.println(path);
        } else if (r == board.length || c == board.length || board[r][c] == 1) {
            return;
        }

        move(r + 1, c, path + "D", board);
        move(r, c + 1, path + "R", board);

    }
}
