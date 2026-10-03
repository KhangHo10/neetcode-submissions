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

        int len = 0;
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            len++;
            curr = curr.next;
        }

        int i = 0;
        int diff = len - n;
        curr = head.next;
        ListNode prev = head;

        while (i <= diff) {
            if (i == diff - 1) {
                prev.next = curr.next;
            }else if (i == 0 && diff == 0) {
                head = curr;
            }else {
                prev = curr;
                curr = curr.next;
            }
            i++;
        }

        return head;
    }
}
