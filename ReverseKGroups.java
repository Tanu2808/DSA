public class ReverseKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return head;
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int cycles = length / k;

        ListNode dummy = new ListNode(0, head);
        ListNode tail = dummy;
        temp = head;
        for (int i = 1; i <= cycles; i++) {
            ListNode groupHead = temp;
            ListNode prev = null;
            for (int j = 0; j < k; j++) {
                ListNode next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }
            tail.next = prev;
            tail = groupHead;
            tail.next = temp;
        }
        return dummy.next;
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