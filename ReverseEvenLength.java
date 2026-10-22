public class ReverseEvenLength {

    public ListNode reverseEvenLengthGroups(ListNode head) {
        if (head == null)
            return head;

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int length = 1;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode node = head;

        while (node != null) {
            int actualLength = Math.min(length, count);
            count -= actualLength;

            if (actualLength % 2 == 0) {
                ListNode groupTail = node;
                ListNode list = null;

                for (int i = 0; i < actualLength; i++) {
                    ListNode temp1 = node.next;
                    node.next = list;
                    list = node;
                    node = temp1;
                }

                prev.next = list;
                groupTail.next = node;
                prev = groupTail;
            } else {
                for (int i = 0; i < actualLength; i++) {
                    prev = node;
                    node = node.next;
                }
            }

            length++;
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