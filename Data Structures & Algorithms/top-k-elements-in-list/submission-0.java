class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> holder = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        int[] b = new int[k];
        for(int a : nums) {
            temp.put(a, temp.getOrDefault(a, 0) + 1);
        }

        for(Map.Entry entry : temp.entrySet()) {
            holder.add(entry);
        }

        for(int i = 0; i < k; i++) {
            b[i] = holder.poll().getKey();
        }
        return b;
    }
}
