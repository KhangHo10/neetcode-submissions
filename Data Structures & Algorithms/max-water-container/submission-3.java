class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;

        while (left < right) {
            int smaller = Math.min(heights[left], heights[right]);

            int curr = smaller * (right - left);
            max = Math.max(max, curr);

            if (heights[left] < heights[right]) {
                left++;
            }else {
                right--;
            }
        }

        return max;
    }
}
