class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> holder = new ArrayDeque<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) continue;

                holder.offer(new int[]{i, j});
            }
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!holder.isEmpty()) {
            int[] curr = holder.poll();

            int row = curr[0];
            int col = curr[1];

            for (int[] d : directions) {
                int newRow = row + d[0];
                int newCol = col + d[1];

                if (newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid[newRow].length || grid[newRow][newCol] != 2147483647) continue;

                grid[newRow][newCol] = grid[row][col]+1;

                holder.offer(new int[]{newRow, newCol});
            }
        }
    }
}
