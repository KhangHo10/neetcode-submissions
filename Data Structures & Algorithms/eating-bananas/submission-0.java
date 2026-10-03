class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int min = r;
        while(r >= l) {
            int mid = l + (r-l)/2;
            int temp = 0;
            for(int a : piles) {
                temp += Math.ceil((double)a / mid);
            }

            if(temp <= h) {
                min = mid;
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return min;
    }
}
