class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] current = new int[nums.length];
        int temp = 1;

        for (int i = 0; i < nums.length; i++) {
            temp *= nums[i];
            prefix[i] = temp;
        }

        temp = 1;
        for (int j = nums.length-1; j >= 0; j--) {
            temp *= nums[j];
            postfix[j] = temp;
        }

        for (int k = 0; k < current.length; k++) {
            if (k == 0) {
                current[k] = postfix[k+1];
            }else if (k == current.length-1) {
                current[k] = prefix[k-1];
            }else {
                current[k] = prefix[k-1] * postfix[k+1];
            }
        }

        return current;
    }
}  

// [1,2,4,6] => [1,2,8,48] || [48,48,24,6]
//  [48,24,12,8]
// [1,2,4,6] => [2,8,48,48] || [48,48,48,24]