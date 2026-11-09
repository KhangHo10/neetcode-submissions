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
    public void reorderList(ListNode head) {
        ListNode curr = head;
        int len = 0;

        while (curr != null) {
            len++;
            curr = curr.next;
        }

        curr = head;
        for (int i = 0; i < (len-1)/2; i++) {
            curr = curr.next;
        }

        ListNode reverse = curr.next;
        ListNode prev = null;

        curr.next = null;

        while (reverse != null) {
            ListNode temp = reverse.next;

            reverse.next = prev;
            prev = reverse;
            reverse = temp;
        }

        reverse = prev;
        curr = head;

        while (reverse != null) {
            ListNode tempA = curr.next;
            ListNode tempB = reverse.next;

            curr.next = reverse;
            reverse.next = tempA;
            curr = tempA;
            reverse = tempB;
        }
    }
}
