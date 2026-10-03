class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> holder = new HashSet<>();

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                List<Integer> temp = new ArrayList<>();

                if (nums[right] + nums[left] + nums[i] == 0) {
                    temp.add(nums[right]);
                    temp.add(nums[left]);
                    temp.add(nums[i]);

                    Collections.sort(temp);
                    holder.add(temp);

                    left++;
                    right--;
                }else if (nums[right] + nums[left] + nums[i] < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        return new ArrayList<>(holder);
    }
}

// [-4, -1, -1, 0, 1, 2]
