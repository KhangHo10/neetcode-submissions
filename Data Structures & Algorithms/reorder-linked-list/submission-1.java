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
        Stack<ListNode> right = new Stack<>();

        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        curr = head;

        for (int i = 0; i < (len + 1) /2; i++) {
            curr = curr.next;
        }

        while (curr != null) {
            right.push(curr);
            curr = curr.next;
        }

        curr = head;

        while (!right.isEmpty()) {
            ListNode track = curr.next;

            curr.next = right.pop();
            curr.next.next = track;
            curr = track;
        }

        curr.next = null;
    }
}


// len
// check len -> even ? odd ?
// [2, 4, 6, 8, 10]
//  l     m    

// 6 -> null
// 4 -> 8 | 8 -> 6
// 2 -> 10 | 10 -> 4

// [2,4,6] [8,10]