class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            holder.putIfAbsent(numbers[i], i+1);
        }

        for(int num : numbers) {
            if(holder.containsKey(target - num)) {
                if(num != (target - num)) {
                    return new int[]{holder.get(num), holder.get(target - num)};
                }
            }
        }
        return null;
    }
}
