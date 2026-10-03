class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;

        int left = 0; 
        int right = height.length-1;
        int lMax = 0;
        int rMax = 0;
        int total = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (lMax < height[left]) {
                    lMax = height[left];
                }else {
                    total += lMax - height[left];
                }
                left++;
            }else {
                if (rMax < height[right]) {
                    rMax = height[right];
                }else {
                    total += rMax - height[right];
                }
                right--;
            }
        }

        return total;
    }
}
