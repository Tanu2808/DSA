public class ReorderList {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        // 1. Find end of first half
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split the list
        ListNode second = slow.next;
        slow.next = null;

        // 3. Reverse second half
        ListNode prev = null;
        ListNode current = second;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        second = prev;

        // 4. Merge
        ListNode first = head;

        while (second != null) {

            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}