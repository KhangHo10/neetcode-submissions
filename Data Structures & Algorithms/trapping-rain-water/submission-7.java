class Solution {
    public int trap(int[] height) {
        if(height.length < 3) {
            return 0;
        }

        int total = 0;
        int l = 0, r = height.length-1;
        int lMax = 0, rMax = 0;
        
        while(r > l) {

            if(height[l] < height[r]) {
                if(lMax < height[l]) {
                    lMax = height[l];
                }else {
                    total += lMax - height[l];
                }

                l++;
            }else {
                if(rMax < height[r]) {
                    rMax = height[r];
                }else {
                    total += rMax - height[r];
                }

                r--;
            }
        }
        return total;
    }
}
