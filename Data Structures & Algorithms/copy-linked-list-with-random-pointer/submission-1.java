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
        HashMap<Integer, Node> temporary = new HashMap<>();
        Node holder = new Node(0);
        Node curr = holder;
        Node h = head;

        while(h != null) {
            Node temp = new Node(h.val);
            curr.next = temp;
            curr = temp;
            temporary.putIfAbsent(curr.val, temp);
            h = h.next;
        }
        
        curr = holder.next;
        h = head;
        while(h != null) {
            if(h.random != null) {
                int a = h.random.val;
                curr.random = temporary.get(a);
                h = h.next;
                curr = curr.next;
            }else {
                curr.random = null;
                h = h.next;
                curr = curr.next;
            }
        }
        
        return holder.next;
        
    }
}
