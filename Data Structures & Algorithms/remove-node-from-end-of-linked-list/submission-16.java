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
        int len = 0;
        ListNode curr = head;

        // Find length
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        int index = len - n;

        // Removing head
        if (index == 0) {
            return head.next;
        }

        // Find node before target
        curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        // Remove target
        curr.next = curr.next.next;

        return head;
    }
}
