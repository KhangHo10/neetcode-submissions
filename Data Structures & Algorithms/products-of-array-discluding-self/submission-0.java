class Solution {
    public int[] productExceptSelf(int[] nums) {
        int j = 0;
        int[] temp = new int[nums.length];
        while(nums.length > j) {
            int sum = 1;
            int i = 0;
                while(nums.length > i) {
                    if((j == i)) {
                        i++;
                    }else {
                        sum = sum * nums[i];
                        i++;
                    }
                }
            temp[j] = sum;
            i=0;
            j++;
        }
        return temp;
    }
}  
