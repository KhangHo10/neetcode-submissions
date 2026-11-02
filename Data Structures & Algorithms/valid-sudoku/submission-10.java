class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> holder = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                String k = board[i][j] + " locate at row " + i;
                String z = board[i][j] + " locate at col " + j;
                String x = board[i][j] + " locate at box " + i/3 + "-" + j/3;

                if (holder.contains(k) || holder.contains(z) || holder.contains(x)) return false;
                holder.add(k);
                holder.add(z);
                holder.add(x);
            }
        }

        return true;
    }
}
