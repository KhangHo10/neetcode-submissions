class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(holder.containsKey(difference)) {
                return new int[] {holder.get(difference), i};
            }
            holder.put(nums[i], i);
        }

        return new int[0];
    }
}
