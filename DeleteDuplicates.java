public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {

                int duplicate = temp.next.val;
                while (temp.next != null && duplicate == temp.next.val) {
                    temp.next = temp.next.next;
                }
            }
            else temp = temp.next;
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