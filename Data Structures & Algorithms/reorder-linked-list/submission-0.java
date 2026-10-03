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
        ListNode slow = head;
        ListNode fast = head;
        ListNode second = null;
        ListNode curr = null;

        // 1, 2, 3, 4, 5, 6, 7
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        second = slow.next;
        slow.next = null;

        // head : 1,2,3,4
        // second : 5,6,7

        while(second != null) {
            ListNode temp = second.next;
            second.next = curr;
            curr = second;
            second = temp;
        }

        // head : 1,2,3,4
        // second : 7,6,5
        ListNode tomp = head;
        second = curr;

        while(second != null) {
            ListNode temp = tomp.next;
            tomp.next = second;
            tomp = second;
            second = second.next;
            tomp.next = temp;
            tomp = temp;
        }

    }
}
