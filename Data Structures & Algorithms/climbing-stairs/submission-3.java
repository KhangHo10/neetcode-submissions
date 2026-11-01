class Solution {
    public int climbStairs(int n) {
        int[] holder = new int[n+1];
        return dfs(holder, 0, n);
    }

    public int dfs(int[] holder, int n, int target) {
        if (n > target) return 0;
        if (n == target) return 1;

        if (holder[n] != 0) return holder[n];

        int a = dfs(holder, n+1, target);
        int b = dfs(holder, n+2, target);

        holder[n] = a + b;

        return holder[n];
    }
}
