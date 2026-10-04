public class IntersectionLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode left = headA;
        ListNode right = headB;
        while (left != right)
        {
            if (left == null) left = headB;
            else left = left.next;

            if (right == null) right = headA;
            else right = right.next;
        }
        return left;
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
