class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Could be 0
        // -nums <= 0 <= +num

        if (nums.length == 0) return false;

        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) return true;
            numbers.add(num);
        }

        return false;
    }
}