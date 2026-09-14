class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rSet = new HashSet[9];
        Set<Character>[] cSet = new HashSet[9];
        Set<Character>[] bSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rSet[i] = new HashSet<>();
            cSet[i] = new HashSet<>();
            bSet[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int box = (i / 3) * 3 + (j / 3);
                if (!rSet[i].add(c)) return false;
                if (!cSet[j].add(c)) return false;
                if (!bSet[box].add(c)) return false;
            }
        }
        return true;
    }
}