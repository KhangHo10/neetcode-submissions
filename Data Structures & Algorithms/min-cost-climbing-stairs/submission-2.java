class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] holder = new int[cost.length];

        return Math.min(dfs(cost, holder, 0), dfs(cost, holder, 1));
    }

    public int dfs(int[] cost, int[] holder, int i) {
        if (i > cost.length-1) return 0;
        if (i == cost.length-1) return cost[i];

        if (holder[i] != 0) return holder[i];

        int valA = dfs(cost, holder, i+1);
        int valB = dfs(cost, holder, i+2);

        int minVal = cost[i] + Math.min(valA, valB);

        holder[i] = minVal;
        return minVal;
    }
}
