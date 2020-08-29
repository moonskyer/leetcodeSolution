package com.moonskyer.offer;

public class Offer12 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static boolean exist(char[][] board, String word) {
        if (word.length() == 0) return true;
        char start = word.charAt(0);
        boolean[][] visited;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == start) {
                    visited = new boolean[board.length][board[0].length];
                    visited[i][j] = true;
                    if (dfs(board, word, 1, i, j, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int index, int i, int j, boolean[][] vis) {
        if (index == word.length()) return true;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (xIsValid(x, board) && yIsValid(y, board) && !vis[x][y] && board[x][y] == word.charAt(index)) {
                vis[x][y] = true;
                boolean result = dfs(board, word, index + 1, x, y, vis);
                if (result) {
                    return true;
                }
                vis[x][y] = false;
            }
        }
        return false;
    }

    public static boolean xIsValid(int x, char[][] board) {
        return x >= 0 && x < board.length;
    }

    public static boolean yIsValid(int y, char[][] board) {
        return y >= 0 && y < board[0].length;
    }
}
