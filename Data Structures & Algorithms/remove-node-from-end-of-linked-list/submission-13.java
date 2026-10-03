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
        if (head.next == null) return null;

        ListNode prev = head;
        ListNode curr = prev.next;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;

        ListNode start = prev;
        curr = prev;

        if (n == 1) {
            start = curr.next;
        }else {
            while (n > 1) {
                if (n <= 2) {
                    prev = curr;
                }
                n--;
                curr = curr.next;
            }
            prev.next = curr.next;
        }

        prev = start;
        curr = prev.next;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start.next = null;

        return prev;
        
    }
}
