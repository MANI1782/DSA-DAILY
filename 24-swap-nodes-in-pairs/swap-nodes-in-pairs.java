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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        // Traverse the list in pairs
        while (temp != null && temp.next != null) {
            // Swap values of current node and the next
            int t = temp.val;
            temp.val = temp.next.val;
            temp.next.val = t;
            // Move to the next pair
            temp = temp.next.next;
        }
        return head;
    }
}