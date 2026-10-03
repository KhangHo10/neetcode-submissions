class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> holder = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int currentValue = board[i][j];
                if(currentValue != '.') {
                   if(!(holder.add(currentValue + " at row " + i)) ||
                   !(holder.add(currentValue + " at collumn " + j)) ||
                   !(holder.add(currentValue + " at sub box of " + i/3 + "-" + j/3))) {
                    return false;
                   } 
                }
            }
        }
        return true;
    }
}
