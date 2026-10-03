class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            holder.put(nums[i], holder.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> temp = new PriorityQueue<>((a, b) -> holder.get(b) - holder.get(a));

        for (int n : holder.keySet()) {
            temp.add(n);
        }

        int[] result = new int[k];
        for (int j = 0; j < result.length; j++) {
            result[j] = temp.poll();
        }

        return result;
    }
}
