public class SwapNode {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0 , head);
        ListNode temp = head;
        int count = 1;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        ListNode A = dummy;
        ListNode B = dummy;
        int a = 1;
        int b = 1;
        while (a < k || b < count - k) {
            if (a < k) {
                A = A.next;
                a++;
            }
            if (b < count - k)
            {
                B = B.next;
                b++;
            }
        }
        int tempInt = A.next.val;
        A.next.val = B.next.val;
        B.next.val = tempInt;

        return dummy.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}