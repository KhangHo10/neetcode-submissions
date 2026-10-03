class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temporary = 1;
        int[] preFix = new int[nums.length];
        int[] postFix = new int[nums.length];
        int[] finallyFix = new int[nums.length];

        for(int i = 0; i < preFix.length; i++) {
            temporary *= nums[i];
            preFix[i] = temporary;
        }
        temporary = 1;

        for(int j = postFix.length-1; j >= 0; j--) {
            temporary *= nums[j];
            postFix[j] = temporary;
        }
        temporary = 1;

        for(int z = 0; z < nums.length; z++) {
            if(z == 0) {
                finallyFix[z] = temporary * postFix[z+1];
            }else if(z == nums.length-1) {
                finallyFix[z] = temporary * preFix[z-1];
            }else {
                finallyFix[z] = preFix[z-1] * postFix[z+1];
            }
            temporary = 1;
        }
        return finallyFix;
    }
}  
