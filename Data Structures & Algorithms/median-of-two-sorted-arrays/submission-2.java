class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        int leftSize = (m + n + 1) / 2;

        while (left <= right) {
            int p1 = (right - left) / 2 + left;
            int p2 = leftSize - p1;

            int maxLeftOne = p1 == 0 ? Integer.MIN_VALUE : nums1[p1-1];
            int minRightOne = p1 == m ? Integer.MAX_VALUE : nums1[p1];

            int maxLeftTwo = p2 == 0 ? Integer.MIN_VALUE : nums2[p2-1];
            int minRightTwo = p2 == n ? Integer.MAX_VALUE : nums2[p2];

            if (maxLeftOne <= minRightTwo && maxLeftTwo <= minRightOne) {
                if ((m + n) % 2 == 1) return Math.max(maxLeftOne, maxLeftTwo);

                double result = Math.min(minRightOne, minRightTwo) + Math.max(maxLeftOne, maxLeftTwo);
                return result / 2;
            }else if (maxLeftOne > minRightTwo) {
                right = p1 - 1;
            }else {
                left = p1 + 1;
            }
        }

        return 0.0;
    }
}
