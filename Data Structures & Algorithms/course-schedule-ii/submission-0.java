class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> holder = new HashMap<>();
        int[] result = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            holder.put(prerequisites[i][0], holder.getOrDefault(prerequisites[i][0], new ArrayList<>()));
            holder.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> path = new HashSet<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(holder, temp, visited, path, i)) return new int[0];
        }

        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }

    public boolean dfs(HashMap<Integer, List<Integer>> holder, List<Integer> temp, HashSet<Integer> visited, HashSet<Integer> path, int i) {
        if (visited.contains(i)) return false;
        if (path.contains(i)) return true;

        visited.add(i);

        if (holder.containsKey(i)) {
            for (int j = 0; j < holder.get(i).size(); j++) {
                if (!dfs(holder, temp, visited, path, holder.get(i).get(j))) return false;
            }
        }

        visited.remove(i);

        path.add(i);
        temp.add(i);

        return true;
    }
}
