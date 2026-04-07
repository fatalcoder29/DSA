class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Start search if first character matches
                if (board[i][j] == word.charAt(0)) {
                    if (search(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int r, int c, int index, String word) {
        // Base case: found full word
        if (index == word.length()) {
            return true;
        }
        
        // Boundary + mismatch check
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != word.charAt(index)) {
            return false;
        }
        
        // Mark visited
        char temp = board[r][c];
        board[r][c] = '#';
        
        // Explore 4 directions
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, -1, 0, 1};
        
        for (int i = 0; i < 4; i++) {
            if (search(board, r + row[i], c + col[i], index + 1, word)) {
                board[r][c] = temp; // restore before returning
                return true;
            }
        }
        
        // Restore and backtrack
        board[r][c] = temp;
        return false;
    }
}