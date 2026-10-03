class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int n : piles) {
            right = Math.max(right, n);
        }

        while (left <= right) {
            int middle = (right - left)/2 + left;
            int total = 0;

            for (int i = 0; i < piles.length; i++) {
                if (piles[i] % middle !=  0) {
                    total +=  (piles[i] + middle - 1) / middle;
                }else {
                    total +=  piles[i] / middle;
                }
            }

            if (total > h) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return left;
    }
}
