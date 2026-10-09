class Solution {
    public int climbStairs(int n) {
        int[] holder = new int[n+1];

        return dfs(n, holder);
    }

    public int dfs(int n, int[] holder) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (holder[n] != 0) return holder[n];

        holder[n] = dfs(n - 1, holder) + dfs(n - 2, holder);

        return holder[n];
    }
}
