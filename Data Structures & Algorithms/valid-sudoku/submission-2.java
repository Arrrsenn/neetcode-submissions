class Solution {
    public boolean isValidSudoku(char[][] board) {
        // проверка строк
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.')
                    continue;
                if (!seen.add(c))
                    return false;
            }
        }

        // проверка столбцов
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c == '.')
                    continue;
                if (!seen.add(c))
                    return false;
            }
        }

        // проверка квадратов 3X3
        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {
                Set<Character> seen = new HashSet<>();
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        char ch = board[blockRow * 3 + r][blockCol * 3 + c];
                        if (ch == '.')
                            continue;
                        if (!seen.add(ch))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
