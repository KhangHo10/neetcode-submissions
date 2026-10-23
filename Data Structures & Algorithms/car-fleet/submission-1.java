class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }


        PriorityQueue<int[]> holder = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < pair.length; i++) {
            holder.add(pair[i]);
        }

        Stack<int[]> storage = new Stack<>();

        while (!holder.isEmpty()) {
            storage.push(holder.poll());
        }

        int result = 0;

        while (!storage.isEmpty()) {
            int[] temp = storage.pop();

            double currentFleet = (double)(target - temp[0]) / temp[1];

            result++;

            while(!storage.isEmpty()) {
                int[] tomp = storage.peek();

                double calculation = (double)(target - tomp[0]) / tomp[1];

                if (calculation <= currentFleet) {
                    storage.pop();
                }else {
                    break;
                }
            }
        }

        return result;
    }
}
