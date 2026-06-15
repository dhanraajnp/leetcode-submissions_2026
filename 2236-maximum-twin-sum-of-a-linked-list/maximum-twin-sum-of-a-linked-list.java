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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Find middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        int max = Integer.MIN_VALUE;

        // Calculate twin sums
        while (secondHalf != null) {
            max = Math.max(max, firstHalf.val + secondHalf.val);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return max;
    }

    public ListNode reverse(ListNode head) {
        ListNode reversedHead = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = reversedHead;
            reversedHead = current;
            current = nextNode;
        }
        return reversedHead;
    }
}