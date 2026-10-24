class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> holder = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        dfs(holder, temp, nums, 0);

        return holder;
    }

    public void dfs(List<List<Integer>> holder, List<Integer> temp, int[] nums, int i) {
        if (i == nums.length) {
            holder.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        dfs(holder, temp, nums, i+1);

        temp.remove(temp.size()-1);
        dfs(holder, temp, nums, i+1);
    }
}
