/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode holder = head;
        int counter = 0;

        while(holder != null) {
            counter++;
            holder = holder.next;
        }

        int remove = counter - n;
        if(remove == 0) {
            ListNode temp = head.next;
            head.next = null;
            head = temp;
            return head;
        }

        ListNode curr = head;
        
        for(int i = 0; i < remove-1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
        
    }
}
