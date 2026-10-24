class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> holder = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        dfs(holder, temp, nums, target, 0, 0);

        return holder;
    }

    public void dfs(List<List<Integer>> holder, List<Integer> temp, int[] nums, int target, int i, int currTotal) {
        if (currTotal > target) return;
        if (currTotal == target) {
            holder.add(new ArrayList<>(temp));
            return;
        }else if (i == nums.length && currTotal != target) {
            return;
        }

        temp.add(nums[i]);
        dfs(holder, temp, nums, target, i, currTotal+nums[i]);

        temp.remove(temp.size()-1);
        dfs(holder, temp, nums, target, i+1, currTotal);

        return;
    }
}
