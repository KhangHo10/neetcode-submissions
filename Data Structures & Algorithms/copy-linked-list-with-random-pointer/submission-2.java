/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> holder = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            Node n = new Node(curr.val);

            holder.put(curr, n);
            
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {
            holder.get(curr).next = holder.get(curr.next);
            holder.get(curr).random = holder.get(curr.random);

            curr = curr.next;
        }

        return holder.get(head);
    }
}
