class Solution {
    public int climbStairs(int n) {
        int[] holder = new int[n+1];

        return dfs(n, holder);
    }

    public int dfs(int n, int[] holder) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (holder[n] != 0) return holder[n];

        int valA = dfs(n-1, holder);
        int valB = dfs(n-2, holder);

        holder[n] = valA + valB;

        return holder[n];
    }
}
