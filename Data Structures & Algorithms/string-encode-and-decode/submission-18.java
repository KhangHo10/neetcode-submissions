class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            int len = s.length();
            result.append(len);
            result.append("#");
            result.append(s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int curr = 0;

        while (curr < str.length()) {
            int start = curr;

            while (str.charAt(curr) != '#') curr++; 

            int len = Integer.parseInt(str.substring(start, curr));
            answer.add(str.substring(curr+1, curr+len+1));

            curr = curr+len+1;
        }

        return answer;
    }
}
