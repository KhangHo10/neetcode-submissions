class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> temp = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] tomp = new int[26];
            char[] holder = strs[i].toCharArray();
            for(int j = 0; j < strs[i].length(); j++) {
                tomp[holder[j] - 'a']++;
            }

            String timp = Arrays.toString(tomp);
            temp.putIfAbsent(timp, new ArrayList<>());
            temp.get(timp).add(strs[i]);
        }

        return new ArrayList<>(temp.values());
    }
}
