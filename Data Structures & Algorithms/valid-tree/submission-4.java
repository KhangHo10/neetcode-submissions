class Solution {
    public boolean validTree(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> holder = new HashMap<>();

        for (int j = 0; j < n; j++) {
            holder.put(j, new HashSet<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];

            holder.get(a).add(b);
            holder.get(b).add(a);
        }

        HashSet<Integer> temp = new HashSet<>();

        return dfs(holder, temp, 0, -1) && temp.size() == n;
    }

    public boolean dfs(HashMap<Integer, HashSet<Integer>> holder, HashSet<Integer> temp, int curr, int parent) {

        if (temp.contains(curr)) return false;

        temp.add(curr);

        for (int k : holder.get(curr)) {
            if (k == parent) continue;
            
            if (!dfs(holder, temp, k, curr)) {
                return false;
            }
        }

        return true;
    }
}
