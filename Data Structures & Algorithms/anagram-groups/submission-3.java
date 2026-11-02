class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> holder = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] temp = new int[26];

            for (char c : strs[i].toCharArray()) temp[c - 'a']++;

            String s = Arrays.toString(temp);

            if (!holder.containsKey(s)) {
                holder.put(s, new ArrayList<>());
            }

            holder.get(s).add(strs[i]);
        }

        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, List<String>> curr : holder.entrySet()) {
            result.add(curr.getValue());
        }

        return result;
    }
}
