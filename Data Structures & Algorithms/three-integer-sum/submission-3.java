class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // -4,-1,-1,0,1,2
        List<List<Integer>> holder = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int a = i+1;
                int b = nums.length-1;

                while(b > a) {
                    if(nums[i] + nums[a] + nums[b] == 0) {
                        holder.add(Arrays.asList(nums[i], nums[a], nums[b]));
                        while(b > a && nums[a] == nums[a+1]) a++;
                        while(b > a && nums[b] == nums[b-1]) b--;
                        a++;
                        b--;
                    }else if(nums[i] + nums[a] + nums[b] > 0){
                        b--;
                    }else {
                        a++;
                    }
                }
            }
            
        }

        return holder;
    }
}
