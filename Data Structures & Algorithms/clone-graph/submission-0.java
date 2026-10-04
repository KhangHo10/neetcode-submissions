/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> holder = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        return dfs(node);    
    }

    public Node dfs(Node node) {
        if (holder.containsKey(node)) {
            return holder.get(node);
        }

        Node curr = new Node(node.val);
        holder.put(node, curr);

        for (Node n : node.neighbors) {
            curr.neighbors.add(dfs(n));
        }

        return curr;
    }
}