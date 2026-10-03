class Solution {
    public int maxArea(int[] heights) {
        //1,7,2,5,4,7,3,6
        int highestWaterVolume = 0;

        int left = 0;
        int right = heights.length-1;

        while(right > left) {
            int diff = right - left;
            if(heights[right] > heights[left]) {
                highestWaterVolume = Math.max(highestWaterVolume, (diff * heights[left]));
                left++;
            }else {
                highestWaterVolume = Math.max(highestWaterVolume, (diff * heights[right]));
                right--;
            }
        }

        return highestWaterVolume;
    }
}
