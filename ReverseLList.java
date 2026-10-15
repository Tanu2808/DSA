class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode list = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = list;
            list = head;
            head = temp;
        }
        return list;

    }    
}