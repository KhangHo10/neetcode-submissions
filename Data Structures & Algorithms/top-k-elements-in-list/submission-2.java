class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> holder = new HashMap<>();
        PriorityQueue<Integer> result = new PriorityQueue<>((a, b) -> holder.get(b) - holder.get(a));

        for (int n : nums) holder.put(n, holder.getOrDefault(n, 0) + 1);

        for (int curr : holder.keySet()) {
            result.add(curr);
        }

        int[] finalResult = new int[k];
        for (int i = 0; i < k; i++) {
            finalResult[i] = result.poll();
        }

        return finalResult;
    }
}
