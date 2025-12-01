class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.')
                    continue;
                int num = c - '1';
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (rows[i][num])
                    return false;
                rows[i][num] = true;
                if (cols[j][num])
                    return false;
                cols[j][num] = true;
                if (boxes[boxIndex][num])
                    return false;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}