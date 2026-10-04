class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> holder = new ArrayDeque<>();
        int counter = 0;
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    holder.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};

        while (!holder.isEmpty() && fresh > 0) {
            int len = holder.size();

            for (int k = 0; k < len; k++) {
                int[] curr = holder.poll();

                int row = curr[0];
                int col = curr[1];

                for (int[] d : directions) {
                    int newRow = row + d[0];
                    int newCol = col + d[1];

                    if (newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid[newRow].length || grid[newRow][newCol] != 1) continue;

                    grid[newRow][newCol] = 2;
                    holder.offer(new int[]{newRow, newCol});
                    fresh--;
                }
            }

            counter++;
        }

        if (fresh != 0) return -1;

        return counter;
    }
}
