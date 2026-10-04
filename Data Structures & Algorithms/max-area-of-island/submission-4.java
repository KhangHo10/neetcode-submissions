class Solution {
    int maxArea = 0;
    int currArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) continue;

                dfs(grid, i, j);
                currArea = 0;
            }
        }

        return maxArea;
    }

    public void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return;

        grid[i][j] = 0;
        currArea += 1;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

        maxArea = Math.max(maxArea, currArea);
    }
}

// [0,1,1,0,1],
// [1,0,1,0,1],
// [0,1,1,0,1],
// [0,1,0,0,1]