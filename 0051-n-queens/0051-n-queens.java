
class Solution {
    List<List<String>> list = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean board[][] = new boolean[n][n];
        helper(board, n, 0);
        return list;
    }

    public void helper(boolean[][] board, int n, int row) {
        if (n == 0) {
            List<String> sc = new ArrayList<>();
            Display(board, sc);
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isItSafe(board, row, col)) {
                board[row][col] = true;
                helper(board, n - 1, row + 1);
                board[row][col] = false;
            }
        }
    }

    public boolean isItSafe(boolean[][] board, int row, int col) {
        // up
        int r = row;
        while (r >= 0) {
            if (board[r][col]) return false;
            r--;
        }

        // right diagonal
        r = row; int c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) return false;
            r--; c++;
        }

        // left diagonal
        r = row; c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) return false;
            r--; c--;
        }
        return true;
    }

    public void Display(boolean[][] board, List<String> sc) {
        for (boolean[] arr : board) {
            String ans = "";
            for (boolean a : arr) {
                if (a) {
                    ans = ans + "Q";
                } else {
                    ans = ans + ".";
                }
            }
            sc.add(ans);
        }
        list.add(sc);
    }
}