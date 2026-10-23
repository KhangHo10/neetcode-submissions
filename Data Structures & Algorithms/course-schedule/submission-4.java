class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> holder = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            holder.put(prerequisites[i][0], holder.getOrDefault(prerequisites[i][0], new ArrayList<>()));
            holder.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> path = new HashSet<>();


        for (int j = 0; j < numCourses; j++) {
            if (!dfs(holder, visited, path, j)) return false;
        }

        return true;

    }

    public boolean dfs(HashMap<Integer, List<Integer>> holder, HashSet<Integer> visited, HashSet<Integer> path, int j) {
        if (visited.contains(j)) return false;
        if (path.contains(j)) return true;
        if (!holder.containsKey(j)) return true;

        visited.add(j);
        path.add(j);

        for (int i = 0; i < holder.get(j).size(); i++) {
            if (!dfs(holder, visited, path, holder.get(j).get(i))) return false;
        }

        visited.remove(j);

        return true;
    }
}


// [[1,0], [2,0], [3,1], [3,2]]