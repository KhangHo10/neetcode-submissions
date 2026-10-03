class Solution {

    public String encode(List<String> strs) {
        StringBuilder all = new StringBuilder();
        for(String temp : strs) {
            all.append(temp.length()).append("#").append(temp);
        }
        return all.toString();
    }

    public List<String> decode(String str) {
        List<String> holder = new ArrayList<>();
        int i = 0;
        int length = 0;

        while(str.length() > i) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }

            length = Integer.parseInt(str.substring(i, j));
            i = j + length + 1;
            holder.add(str.substring(j+1, i));
        }
        return holder;
    }
    
}
