public class ReverseLLII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left >= right)
            return head;
        ListNode node = head;
        if (left > 1) {
            for (int i = 1; i < left - 1; i++) {
                node = node.next;
            }
        }

        ListNode tail = (left == 1) ? head : node.next;
        ListNode temp = tail;

        ListNode list = null;
        for (int i = left; i <= right; i++) {
            ListNode temp1 = temp.next;
            temp.next = list;
            list = temp;
            temp = temp1;
        }
        tail.next = temp;

        if (left == 1) {
            return list;
        }

        node.next = list;
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