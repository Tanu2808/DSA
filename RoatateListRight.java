public class RoatateListRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        if (k >= length) k = k % length;
        int firstNodes = length - k;
        ListNode temp = head;
        for (int i = 1; i < firstNodes; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
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