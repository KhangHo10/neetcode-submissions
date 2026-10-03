class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (holder.containsKey(nums[i])) {
                return new int[]{holder.get(nums[i]), i};
            }

            holder.put(diff, i);
        }

        return new int[0];
    }
}
