class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];

        for (int j = 0; j < heights[0].length; j++) {
            dfs(heights, pacific, 0, j);
        }
        for (int i = 0; i < heights.length; i++) {
            dfs(heights, pacific, i, 0);
        }

        for (int j = 0; j < heights[0].length; j++) {
            dfs(heights, atlantic, heights.length-1, j);
        }
        for (int i = 0; i < heights.length; i++) {
            dfs(heights, atlantic, i, heights[0].length-1);
        }

        List<List<Integer>> answer = new ArrayList<>();


        for (int i = 0; i < pacific.length; i++) {
            for (int j = 0; j < pacific[i].length; j++) {
                if (pacific[i][j] && atlantic[i][j]) answer.add(new ArrayList<>(Arrays.asList(i, j)));
            }
        }

        return answer;


    }

    public void dfs(int[][] heights, boolean[][] holder, int i, int j) {
        if (holder[i][j]) return;

        holder[i][j] = true;

        if (i + 1 < heights.length && heights[i+1][j] >= heights[i][j]) dfs(heights, holder, i+1, j);
        if (i - 1 >= 0 && heights[i-1][j] >= heights[i][j]) dfs(heights, holder, i-1, j);
        if (j + 1 < heights[i].length && heights[i][j+1] >= heights[i][j]) dfs(heights, holder, i, j+1);
        if (j - 1 >= 0 && heights[i][j-1] >= heights[i][j]) dfs(heights, holder, i, j-1);
    }
}
