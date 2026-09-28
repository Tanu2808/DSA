public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            temp.val = sum % 10;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null && l2 != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        while (l1 != null) {
            temp.next = new ListNode(0);
            temp = temp.next;
            int sum = l1.val + carry;
            temp.val = sum % 10;
            carry = sum / 10;
            
            l1 = l1.next;
        }
        while (l2 != null) {
            temp.next = new ListNode(0);
            temp = temp.next;
            int sum = l2.val + carry;
            temp.val = sum % 10;
            carry = sum / 10;
            l2 = l2.next;
        }
        if (carry != 0) temp.next = new ListNode(carry);
        return result;
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
