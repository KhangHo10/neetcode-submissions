class Solution {
    public int numIslands(char[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '0') continue;

                total += dfs(grid, i, j);
            }
        }

        return total;
    }

    public int dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return 0;
        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

        return 1;
    }
}

// ["0","1","1","1","0"],
// ["0","1","0","1","0"],
// ["1","1","0","0","0"],
// ["0","0","0","0","0"]