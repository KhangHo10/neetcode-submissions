class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int currHeight;
            int currWidth = right - left;

            if (heights[right] > heights[left]) {
                currHeight = heights[left];
                left++;
            }else {
                currHeight = heights[right];
                right--;
            }

            max = Math.max(max, currHeight*currWidth);
        }

        return max;
    }
}
