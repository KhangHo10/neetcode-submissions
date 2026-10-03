class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> holder = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] temp = new int[26];
            for (char c : strs[i].toCharArray()) {
                temp[c-97]++;
            }

            List<Integer> tomp = new ArrayList<>();

            for (int n : temp) {
                tomp.add(n);
            }

            if (!holder.containsKey(tomp)) {
                holder.put(tomp, new ArrayList<>());
            }

            holder.get(tomp).add(strs[i]);
        }

        List<List<String>> timp = new ArrayList<>();
        
        for (Map.Entry<List<Integer>, List<String>> h : holder.entrySet()) {
            timp.add(h.getValue());
        }

        return timp;
    }
}
