class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";

        StringBuilder holder = new StringBuilder();

        for (String s : strs) {
            int len = s.length();
            holder.append(len);
            holder.append("#");
            holder.append(s);
        }

        return holder.toString();
    }

    public List<String> decode(String str) {
        List<String> holder = new ArrayList<>();
        int curr = 0;

        while (curr < str.length()) {
            int start = curr;

            while (str.charAt(curr) != '#') {
                curr++;
            }

            int count = Integer.parseInt(str.substring(start, curr));
            curr++;
            holder.add(str.substring(curr, curr + count));
            curr += count;
        }

        return holder;
    }
}
