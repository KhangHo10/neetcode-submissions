class Solution {
    public int countSubstrings(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = dfs(s, i, i);
            int even = dfs(s, i, i+1);

            total += odd + even;
        }

        return total;
    }

    public int dfs(String s, int i, int j) {
        if (i < 0 || j >= s.length()) return 0;
        if (!s.substring(i, i+1).equals(s.substring(j, j+1))) return 0;


        return 1 + dfs(s, i-1, j+1);
    }
}
