package Lec_22;

public class blocked_maze1 {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0},};
        move(0, 0, "", board, new boolean[board.length][board[0].length]);
    }

    public static void move(int r, int c, String path, int[][] board, boolean[][] visited) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(path);
        } else if (r == board.length || c == board[0].length || r < 0 || c < 0 || visited[r][c] || board[r][c] == 1) {
            return;
        }

        visited[r][c] = true;
        move(r - 1, c, path + "U", board, visited);
        move(r + 1, c, path + "D", board, visited);
        move(r, c - 1, path + "L", board, visited);
        move(r, c + 1, path + "R", board, visited);
        visited[r][c] = false;

    }
}
