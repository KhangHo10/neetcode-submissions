class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) return new int[]{1,2};

        for (int i = 0; i < numbers.length; i++) {
            int left = i + 1;
            int right = numbers.length - 1;
            int temp = target - numbers[i];

            while (left <= right) {
                int middle = (right - left)/2 + left;

                if (numbers[middle] == temp) {
                    return new int[]{i + 1, middle + 1};
                }else if (numbers[middle] < temp) {
                    left = middle + 1;
                }else {
                    right = middle - 1;
                }
            }
        }

        return new int[0];
    }
}
// Target - middle =
// 5 - 2 = 3 | 3 > 2
// 5 - 3 = 2 | 2 < 3
// 2 - 5 =-3 | -3 < 5