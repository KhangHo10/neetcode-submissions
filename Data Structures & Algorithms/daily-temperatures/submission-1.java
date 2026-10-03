class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 1) return new int[]{0};

        int len = temperatures.length;
        int[] result = new int[len];
        Stack<Integer> holder = new Stack<>();

        for (int i = 0; i < len; i++) {
            
            while (!holder.isEmpty() && temperatures[i] > temperatures[holder.peek()]) {
                int curr = holder.pop();
                result[curr] = i - curr;
            }

            holder.push(i);
        }
        
        return result;
    }
}
