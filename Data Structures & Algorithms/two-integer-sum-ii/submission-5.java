class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            holder.putIfAbsent(numbers[i], i+1);
        }

        for(int a : numbers) {
            if(holder.containsKey(target-a)) {
                return new int[]{holder.get(a), holder.get(target-a)}; 
            }
        }

        return null;
    }
}
