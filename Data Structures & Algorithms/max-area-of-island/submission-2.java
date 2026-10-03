class Solution {
    private int a = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != 0) {
                    areaIsland(grid, i, j);
                    max = Math.max(max, a);
                    a = 0;
                }
            }
        }

        return max;
    }

    public void areaIsland(int[][]grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return;
        }

        a++;
        grid[i][j] = 0;
        areaIsland(grid, i + 1, j);
        areaIsland(grid, i - 1, j);
        areaIsland(grid, i, j + 1);
        areaIsland(grid, i, j - 1);
    }
}
