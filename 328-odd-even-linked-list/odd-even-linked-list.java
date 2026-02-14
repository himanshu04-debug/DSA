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
    public ListNode oddEvenList(ListNode head) {

    if (head == null || head.next == null)
        return head;

    ListNode odd = head;          // 1
    ListNode even = head.next;    // 2
    ListNode evenHead = even;     // store 2

    while (even != null && even.next != null) {

        odd.next = even.next;  // connect 1 -> 3
        odd = odd.next;        // move odd

        even.next = odd.next;  // connect 2 -> 4
        even = even.next;      // move even
    }

    odd.next = evenHead;   // attach even list at end

    return head;
}

}