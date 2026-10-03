class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compare = new HashMap<>();
        int[] temp = new int[2];

        for(int i = 0; i < nums.length; i++) {
            Integer tomp = compare.get(nums[i]);

            if(tomp != null) {
                temp[0] = compare.get(nums[i]);
                temp[1] = i;
            }
            compare.put(target - nums[i], i);
        }
        return temp;
    }
}
