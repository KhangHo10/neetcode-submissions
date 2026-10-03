class Solution {
    public int maxProfit(int[] prices) {
        // 1 <= prices.length <= 10000

        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int curr = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) curr = Math.max(prices[j] - prices[i], curr);
            }
            max = Math.max(curr, max);
        }

        return max;
    }
}
