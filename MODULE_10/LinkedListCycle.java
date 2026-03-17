// LeetCode 141 – Linked List Cycle (Easy)

package MODULE_10;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps
            if(slow == fast) {
                return true;           // cycle detected
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating nodes
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle
        fourth.next = second;

        System.out.println(hasCycle(head));
    }
}
