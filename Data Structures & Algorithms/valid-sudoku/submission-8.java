class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> holder = new ArrayList<>();
        List<HashSet<Character>> keeper = new ArrayList<>();
        //Integer.parseInt(String.valueOf(board[i][j]))

        for (int k = 0; k < board[0].length; k++) {
            holder.add(new HashSet<>());
            keeper.add(new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            HashSet<Character> temp = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    System.out.println(board[i][j]);
                    // row
                    if (!temp.add(board[i][j])) return false;
                    System.out.println("hello");

                    // col
                    if (!holder.get(j).add(board[i][j])) return false;
                    System.out.println("hellox2");

                    // sub-box
                    int curr = (i/3) * 3 + (j/3);
                    if (!keeper.get(curr).add(board[i][j])) return false;
                }
            }
        }

        return true;
    }
}

// HashSet

// board=[
//     [".",".",".",".","5",".",".","1","."],
//     [".","4",".","3",".",".",".",".","."],
//     [".",".",".",".",".","3",".",".","1"],
//     ["8",".",".",".",".",".",".","2","."],
//     [".",".","2",".","7",".",".",".","."],
//     [".","1","5",".",".",".",".",".","."],
//     [".",".",".",".",".","2",".",".","."],
//     [".","2",".","9",".",".",".",".","."],
//     [".",".","4",".",".",".",".",".","."]]
