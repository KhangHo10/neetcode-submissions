class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> holder = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            holder.put(prerequisites[i][0], holder.getOrDefault(prerequisites[i][0], new ArrayList<>()));
            holder.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        HashSet<Integer> visited;
        HashSet<Integer> path = new HashSet<>();


        for (int j = 0; j < numCourses; j++) {
            visited = new HashSet<>();
            if (!dfs(holder, visited, path, j)) return false;
        }

        return true;

    }

    public boolean dfs(HashMap<Integer, List<Integer>> holder, HashSet<Integer> visited, HashSet<Integer> path, int j) {
        if (visited.contains(j)) return false;
        if (!holder.containsKey(j) || holder.get(j).size() == 0) return true;

        if (path.contains(j)) return true;

        visited.add(j);

        int prereq = holder.get(j).get(0);
        holder.get(j).remove(0);

        return dfs(holder, visited, path, prereq);
    }
}


// [[1,0], [2,0], [3,1], [3,2]]