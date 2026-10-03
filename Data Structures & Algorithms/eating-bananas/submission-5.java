class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int[] holder = new int[piles.length];

        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length-1];

        while (left <= right) {
            int middle = (right - left)/2 + left;
            int total = 0;

            for (int i = 0; i < piles.length; i++) {
                if (piles[i] % middle !=  0) {
                    holder[i] =  (piles[i] + middle - 1) / middle;
                }else {
                    holder[i] =  piles[i] / middle;
                }
                total += holder[i];
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
