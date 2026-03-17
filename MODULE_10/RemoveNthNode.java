// LeetCode 19 – Remove Nth Node From End of List (Medium)

package MODULE_10;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // Move fast pointer n+1 steps
        for(int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // Move both pointers
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove node
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("After Removing Node:");
        printList(head);
    }
}