class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) return new int[]{1,2};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            }else if (sum < target) {
                left++;
            }else {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[0];
    }
}
// Target - middle =
// 5 - 2 = 3 | 3 > 2
// 5 - 3 = 2 | 2 < 3
// 2 - 5 =-3 | -3 < 5