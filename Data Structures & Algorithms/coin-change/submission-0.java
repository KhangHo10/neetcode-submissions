class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] holder = new int[amount+1];

        for (int i = 0; i < holder.length; i++) holder[i] = -2;

        return dfs(coins, holder, amount);
    }

    public int dfs(int[] coins, int[] holder, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (holder[amount] != -2) return holder[amount];

        int min = Integer.MAX_VALUE;

        for (int c : coins) {
            int curr = dfs(coins, holder, amount - c);

            if (curr != -1) {
                min = Math.min(min, curr+1);
            }
        }

        holder[amount] = min == Integer.MAX_VALUE ? -1 : min;

        return holder[amount];
    }


}
