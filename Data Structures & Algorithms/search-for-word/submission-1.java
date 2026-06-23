class Solution {
    int n, m, wordSize;

    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

    public boolean isExist(char[][] board, boolean[][] visited, int i, int j, String word, int index) {
        if (index == wordSize) return true;

        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j]) return false;

        if (board[i][j] != word.charAt(index)) return false;

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int x = i + dir[k][0];
            int y = j + dir[k][1];

            if (isExist(board, visited, x, y, word, index + 1)) {
                return true;
            }
        }
        visited[i][j] = false;

        return false;
    }

    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        wordSize = word.length();

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == word.charAt(0)) {
                    if (isExist(board, visited, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}