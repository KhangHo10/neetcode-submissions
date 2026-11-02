class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] holderA = new int[nums.length];
        int[] holderB = new int[nums.length];

        for (int i = 0; i < holderA.length; i++) {
            holderA[i] = -1;
            holderB[i] = -1;
        }

        return Math.max(dfs(nums, holderA, 1, nums.length-1), dfs(nums, holderB, 0, nums.length-2));
    }

    public int dfs(int[] nums, int[] holder, int i, int end) {
        if (i > end) return 0;

        if (holder[i] != -1) return holder[i];

        int curr = nums[i] + dfs(nums, holder, i+2, end);
        int skip = dfs(nums, holder, i+1, end);

        int maxVal = Math.max(curr, skip);

        holder[i] = maxVal;
        return maxVal;
    }
}
